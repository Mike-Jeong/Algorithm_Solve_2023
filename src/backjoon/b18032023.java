package backjoon;

import java.io.*;
import java.util.*;

//안녕
//18032023

public class b18032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] profits = new int[n + 1][2];
        int[][] dp = new int[n + 1][101];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            profits[i][0] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            profits[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 100; j++) {
                if (profits[i][0] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j - profits[i][0]] + profits[i][1], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][99]);

    }
}
