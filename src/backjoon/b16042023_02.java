package backjoon;

import java.io.*;
import java.util.*;

//가장 긴 증가하는 부분 수열 6
//16042023

public class b16042023_02 {

    static int nums[][];
    static long tree[][];
    static int n;
    static int treeSize;
    static int count = 0;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        nums = new int[n][2];
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));
        treeSize = (int) Math.pow(2, h + 1);
        tree = new long[treeSize][2];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            nums[i][0] = Integer.parseInt(st.nextToken());
            nums[i][1] = i;
        }

        Arrays.sort(nums, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }

                return o1[0] - o2[0];
            }

        });

        for (int i = 0; i < n; i++) {
            update(nums[i][1] + 1);
        }

        /*
         * for (int i = 0; i < tree.length; i++) {
         * System.out.println(tree[i][0] + " " + tree[i][1]);
         * }
         */

        System.out.println(tree[1][0] + " " + tree[1][1]);
    }

    private static long[] findMax(int idx, int start, int end, int fs, int fe) {
        if (fe < start || fs > end)
            return new long[] { 0, 0 };
        else if (fs <= start && end <= fe)
            return new long[] { tree[idx][0], tree[idx][1] };
        else {
            int mid = (start + end) / 2;

            long[] front = findMax(2 * idx, start, mid, fs, fe);
            long[] back = findMax(2 * idx + 1, mid + 1, end, fs, fe);

            long[] check = new long[2];

            if (front[0] == back[0]) {
                check[0] = front[0];
                check[1] = (front[1] + back[1]) % 1000000007;
            } else if (front[0] > back[0]) {
                check[0] = front[0];
                check[1] = front[1];
            } else {
                check[0] = back[0];
                check[1] = back[1];
            }

            return check;
        }
    }

    public static void update(int index) {

        long[] maxValue = findMax(1, 1, n, 1, index);
        maxValue[0] += 1;

        if (maxValue[1] == 0) {
            maxValue[1] += 1;
        }

        // System.out.println(index + " " + maxValue[0] + " " + maxValue[1]);

        /*
         * if (tree[1] == maxValue) {
         * count++;
         * } else if (tree[1] < maxValue) {
         * count = 1;
         * }
         */

        update(index, maxValue, 1, 1, n);
    }

    private static void update(int index, long[] value, int node, int left, int right) {

        if (index < left || index > right) {
            return;
        }

        if (left == right) {
            tree[node][0] = value[0];
            tree[node][1] = value[1];
            return;
        }

        int mid = (left + right) / 2;

        update(index, value, node * 2, left, mid);
        update(index, value, node * 2 + 1, mid + 1, right);

        if (tree[node * 2][0] == tree[node * 2 + 1][0]) {

            tree[node][0] = tree[node * 2][0];
            tree[node][1] = (tree[node * 2][1] + tree[node * 2 + 1][1]) % 1000000007;

        } else if (tree[node * 2][0] > tree[node * 2 + 1][0]) {

            tree[node][0] = tree[node * 2][0];
            tree[node][1] = tree[node * 2][1];

        } else {
            
            tree[node][0] = tree[node * 2 + 1][0];
            tree[node][1] = tree[node * 2 + 1][1];
        }

    }
}
