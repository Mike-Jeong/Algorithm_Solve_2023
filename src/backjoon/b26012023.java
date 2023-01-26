package backjoon;

import java.io.*;
import java.util.*;

//구간 곱 구하기
//26012023

public class b26012023 {

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
                update(1, 1, n, b, c);
                nums[b] = c;
            } else {
                System.out.println(mul(1, 1, n, b, (int) c));
            }
        }

    }

    static long init(int node, int start, int end) {

        if (start == end) {
            return tree[node] = nums[start];
        }

        return tree[node] = (init(node * 2, start, (start + end) / 2)
                * init(node * 2 + 1, (start + end) / 2 + 1, end)) % 1000000007;
    }

    static long update(int node, int start, int end, int idx, long val) {

        if (idx < start || end < idx) {
            return tree[node];
        }

        if (start == end) {
            return tree[node] = val;
        }

        return tree[node] = (update(node * 2, start, (start + end) / 2, idx, val) *
                update(node * 2 + 1, (start + end) / 2 + 1, end, idx, val)) % 1000000007;
    }

    static long mul(int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 1;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        return (mul(node * 2, start, (start + end) / 2, left, right) *
                mul(node * 2 + 1, (start + end) / 2 + 1, end, left, right)) % 1000000007;
    }
}
