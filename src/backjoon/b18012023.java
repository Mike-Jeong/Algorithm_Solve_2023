package backjoon;

import java.io.*;
import java.util.*;

//구간 합 구하기
//18012023

public class b18012023 {

    static long nums[];
    static long tree[];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        nums = new long[n + 1];
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));
        int treeSize = (int) Math.pow(2, h + 1);
        tree = new long[treeSize];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i] = Long.parseLong(st.nextToken());
        }

        init(1, 1, n);

        /*
         * System.out.println();
         * for (int i = 0; i < tree.length; i++) {
         * System.out.print(tree[i] + " ");
         * }
         * System.out.println();
         */

        for (int i = 0; i < m + k; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                update(1, 1, n, b, c - nums[b]);
                nums[b] = c;
            } else {
                System.out.println(sum(1, 1, n, b, (int) c));
            }
        }

    }

    static long init(int node, int start, int end) {

        if (start == end) {
            return tree[node] = nums[start];
        }

        return tree[node] = init(node * 2, start, (start + end) / 2)
                + init(node * 2 + 1, (start + end) / 2 + 1, end);
    }

    static void update(int node, int start, int end, int idx, long diff) {
        if (idx < start || end < idx)
            return;

        tree[node] += diff;

        if (start != end) {
            update(node * 2, start, (start + end) / 2, idx, diff);
            update(node * 2 + 1, (start + end) / 2 + 1, end, idx, diff);
        }
    }

    static long sum(int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 0;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        return sum(node * 2, start, (start + end) / 2, left, right) +
                sum(node * 2 + 1, (start + end) / 2 + 1, end, left, right);
    }
}
