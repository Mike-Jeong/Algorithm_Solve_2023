package backjoon;

import java.io.*;
import java.util.*;

//수열과 쿼리 37
//10022023

public class b10022023 {

    static int nums[];
    static int tree[];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        nums = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int h = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        int treeSize = (int) Math.pow(2, h - 1);
        tree = new int[treeSize * 2];
        Arrays.fill(tree, 0);

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
            int c = Integer.parseInt(st.nextToken());

            if (a == 1) {
                nums[b] = c;
                update(1, 1, n, b);
            } else if (a == 2) {
                sb.append((c - b + 1) - findOdd(1, 1, n, b, c)).append("\n");
            } else if (a == 3) {
                sb.append(findOdd(1, 1, n, b, c)).append("\n");
            }

        }

        System.out.println(sb);

    }

    static int init(int node, int start, int end) {

        if (start == end) {
            return tree[node] = nums[start] % 2 == 0 ? 0 : 1;
        }

        return tree[node] = init(node * 2, start, (start + end) / 2) + 
                init(node * 2 + 1, (start + end) / 2 + 1, end);
    }

    static int update(int node, int start, int end, int idx) {
        if (idx < start || end < idx) {
            return tree[node];
        }

        if (start == end) {
            return tree[node] = nums[idx] % 2 == 0 ? 0 : 1;
        }
        return tree[node] = update(node * 2, start, (start + end) / 2, idx) + 
                update(node * 2 + 1, (start + end) / 2 + 1, end, idx);

    }

    static int findOdd(int idx, int start, int end, int fs, int fe) {
        if (fe < start || fs > end)
            return 0;
        else if (fs <= start && end <= fe)
            return tree[idx];
        else {
            int mid = (start + end) / 2;
            return findOdd(2 * idx, start, mid, fs, fe) + findOdd(2 * idx + 1, mid + 1, end, fs, fe);
        }
    }
}
