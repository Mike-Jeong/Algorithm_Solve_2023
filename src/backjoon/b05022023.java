package backjoon;

import java.io.*;
import java.util.*;

//수열과 쿼리 17
//05022023

public class b05022023 {

    static long nums[];
    static long tree[];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        nums = new long[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int h = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        int treeSize = (int) Math.pow(2, h - 1);
        tree = new long[treeSize * 2];
        Arrays.fill(tree, Integer.MAX_VALUE);

        init(1, 1, n);

        /*
         * System.out.println();
         * for (int i = 0; i < treeMin.length; i++) {
         * System.out.print(treeMin[i] + " ");
         * }
         * System.out.println();
         * 
         * System.out.println();
         * for (int i = 0; i < treeMax.length; i++) {
         * System.out.print(treeMax[i] + " ");
         * }
         * System.out.println();
         */

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                nums[b] = c;
                update(1, 1, n, b);

            } else if (a == 2) {
                sb.append(findMin(1, 1, n, b, (int) c)).append("\n");
            }

        }

        System.out.println(sb);

    }

    static long init(int node, int start, int end) {

        if (start == end) {
            return tree[node] = nums[start];
        }

        return tree[node] = Math.min(init(node * 2, start, (start + end) / 2),
                init(node * 2 + 1, (start + end) / 2 + 1, end));
    }

    static long update(int node, int start, int end, int idx) {
        if (idx < start || end < idx) {
            return tree[node];
        }

        if (start == end) {
            return tree[node] = nums[idx];
        }
        return tree[node] = Math.min(update(node * 2, start, (start + end) / 2, idx),
                update(node * 2 + 1, (start + end) / 2 + 1, end, idx));

    }

    static long findMin(int idx, int start, int end, int fs, int fe) {
        if (fe < start || fs > end)
            return 1000000000;
        else if (fs <= start && end <= fe)
            return tree[idx];
        else {
            int mid = (start + end) / 2;
            return Math.min(findMin(2 * idx, start, mid, fs, fe), findMin(2 * idx + 1, mid + 1, end, fs, fe));
        }
    }
}
