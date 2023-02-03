package backjoon;

import java.io.*;
import java.util.*;

//수들의 합 7
//03022023

public class b03022023 {

    static long nums[];
    static long tree[];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        nums = new long[n + 1];
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));
        int treeSize = (int) Math.pow(2, h + 1);
        tree = new long[treeSize];

        /*
         * System.out.println();
         * for (int i = 0; i < tree.length; i++) {
         * System.out.print(tree[i] + " ");
         * }
         * System.out.println();
         */

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0) {
                sb.append(sum(1, 1, n, Math.min(b, c), Math.max(b, c))).append("\n");
            } else {
                update(1, 1, n, b, c - nums[b]);
                nums[b] = c;
            }

        }

        System.out.println(sb);

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
