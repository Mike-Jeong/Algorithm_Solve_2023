package backjoon;

import java.io.*;
import java.util.*;

//점프
//31052023

public class b31052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];
        long[][] dp = new long[n][n];

        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {

                map[i][j] = Integer.parseInt(st.nextToken());

                if (dp[i][j] != 0 && map[i][j] != 0) {

                    if (i + map[i][j] < n) {
                        dp[i + map[i][j]][j] += dp[i][j];
                    }

                    if (j + map[i][j] < n) {
                        dp[i][j + map[i][j]] += dp[i][j];
                    }
                }

            }
        }

        System.out.println(dp[n - 1][n - 1]);
    }
}
