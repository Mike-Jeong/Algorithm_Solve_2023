package backjoon;

import java.io.*;
import java.util.*;

//수열과 쿼리 15
//08022023

public class b08022023 {

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

            if (a == 1) {
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                update(1, 1, n, b, c);
            } else if (a == 2) {
                sb.append(tree[1]).append("\n");
            }

        }

        System.out.println(sb);

    }

    static void init(int node, int start, int end) {

        if (start == end) {
            tree[node] = start;
            return;
        }

        init(node * 2, start, (start + end) / 2);
        init(node * 2 + 1, (start + end) / 2 + 1, end);

        if (nums[tree[node * 2]] <= nums[tree[node * 2 + 1]]) {
            tree[node] = tree[node * 2];
        } else {
            tree[node] = tree[node * 2 + 1];
        }
    }

    static void update(int node, int start, int end, int idx, int val) {
        if (idx < start || end < idx) {
            return;
        }

        if (start == end) {
            tree[node] = idx;
            nums[idx] = val;
            return;
        }

        update(node * 2, start, (start + end) / 2, idx, val);
        update(node * 2 + 1, (start + end) / 2 + 1, end, idx, val);

        if (nums[tree[node * 2]] <= nums[tree[node * 2 + 1]]) {
            tree[node] = tree[node * 2];
        } else {
            tree[node] = tree[node * 2 + 1];
        }
    }

    static int findMin(int start, int end, int node, int left, int right) {
        if (left > end || right < start) {
            return -1;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;
        int m1 = findMin(start, mid, node * 2, left, right);
        int m2 = findMin(mid + 1, end, node * 2 + 1, left, right);

        if (m1 == -1) {
            return m2;
        } else if (m2 == -1) {
            return m1;
        } else {
            if (nums[m1] <= nums[m2]) {
                return m1;
            } else {
                return m2;
            }
        }
    }
}
