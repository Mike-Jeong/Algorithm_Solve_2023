package backjoon;

import java.io.*;
import java.util.*;

//구간 합 구하기 3
//11022023

public class b11022023 {

    static int nums[][];
    static int dp[][];

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        nums = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                update(i, j, nums[i][j], n);
            }
        }

        /*
         * System.out.println();
         * for (int i = 0; i < tree.length; i++) {
         * System.out.print(tree[i] + " ");
         * }
         * System.out.println();
         */

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            if (w == 0) {
                int val = Integer.parseInt(st.nextToken());
                update(x1, y1, val - nums[x1][y1], n);
                nums[x1][y1] = val;
            } else {
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                sb.append((sum(x2, y2) - sum(x2, y1 - 1) - sum(x1 - 1, y2) + sum(x1 - 1, y1 - 1)) + "\n");
            }
        }

        System.out.println(sb);

    }

    static void update(int x, int y, int val, int n) {

        while (x <= n) {
            for (int i = y; i <= n;) {
                dp[x][i] += val;
                i += i & -i;
            }
            x += x & -x;
        }
    }

    static int sum(int x, int y) {

        int result = 0;

        while (x > 0) {
            for (int i = y; i > 0;) {
                result += dp[x][i];
                i -= i & -i;
            }
            x -= x & -x;
        }

        return result;
    }
} // 다시 공부하기

//펜윅트리 풀이 코드
// code get from https://loosie.tistory.com/m/691