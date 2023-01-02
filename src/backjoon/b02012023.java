package backjoon;

import java.io.*;
import java.util.*;

//카우버거 알바생
//02012023

public class b02012023 {

    static int[][][] dp;
    static int[][] order;
    static int n;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[n][m + 1][k + 1];
        order = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            order[i][0] = Integer.parseInt(st.nextToken());
            order[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                for (int j2 = 0; j2 <= k; j2++) {
                    dp[i][j][j2] = -1;
                }
            }
        }

        System.out.println("답은 : " + solve(0, m, k));
        

        for (int i = 0; i < n; i++) {

            System.out.println(i + " 번쩨");

            for (int j = 0; j <= m; j++) {
                for (int j2 = 0; j2 <= k; j2++) {
                    System.out.print(dp[i][j][j2] + " ");
                }
                System.out.print("\n");
            }
        }


    }

    public static int solve(int o, int m, int k) {

        if (o == n) {
            return 0;
        }

        if (dp[o][m][k] >= 0) {
            return dp[o][m][k];
        }

        int cnt = 0;

        if (order[o][0] <= m && order[o][1] <= k) {
            cnt = solve(o + 1, m - order[o][0], k- order[o][1]) + 1;
        }

        cnt = Math.max(cnt, solve(o + 1, m, k));

        return dp[o][m][k] = cnt;
    }
}