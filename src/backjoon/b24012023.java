package backjoon;

import java.io.*;
import java.util.*;

//최솟값과 최댓값
//24012023

public class b24012023 {

    static long nums[];
    static long treeMin[];
    static long treeMax[];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        nums = new long[n + 1];
        int h = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        int treeSize = (int) Math.pow(2, h - 1);
        treeMax = new long[treeSize * 2];
        treeMin = new long[treeSize * 2];
        Arrays.fill(treeMax, 0);
        Arrays.fill(treeMin, Integer.MAX_VALUE);

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i] = Long.parseLong(st.nextToken());
        }

        initMin(1, 1, n);
        initMax(1, 1, n);

        /*System.out.println();
        for (int i = 0; i < treeMin.length; i++) {
            System.out.print(treeMin[i] + " ");
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < treeMax.length; i++) {
            System.out.print(treeMax[i] + " ");
        }
        System.out.println();*/

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            sb.append(findMin(1, 1, n, start, end)).append(" ").append(findMax(1, 1, n, start, end)).append("\n");

        }

        System.out.println(sb);

    }

    static long initMin(int node, int start, int end) {

        if (start == end) {
            return treeMin[node] = nums[start];
        }

        return treeMin[node] = Math.min(initMin(node * 2, start, (start + end) / 2),
                initMin(node * 2 + 1, (start + end) / 2 + 1, end));
    }

    static long initMax(int node, int start, int end) {

        if (start == end) {
            return treeMax[node] = nums[start];
        }

        return treeMax[node] = Math.max(initMax(node * 2, start, (start + end) / 2),
                initMax(node * 2 + 1, (start + end) / 2 + 1, end));
    }

    static long findMax(int idx, int start, int end, int fs, int fe) {
        if (fe < start || fs > end)
            return 0;
        else if (fs <= start && end <= fe)
            return treeMax[idx];
        else {
            int mid = (start + end) / 2;
            return Math.max(findMax(2 * idx, start, mid, fs, fe), findMax(2 * idx + 1, mid + 1, end, fs, fe));
        }
    }

    static long findMin(int idx, int start, int end, int fs, int fe) {
        if (fe < start || fs > end)
            return 1000000000;
        else if (fs <= start && end <= fe)
            return treeMin[idx];
        else {
            int mid = (start + end) / 2;
            return Math.min(findMin(2 * idx, start, mid, fs, fe), findMin(2 * idx + 1, mid + 1, end, fs, fe));
        }
    }
}
