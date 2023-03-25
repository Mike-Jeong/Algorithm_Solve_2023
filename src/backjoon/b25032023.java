package backjoon;

import java.io.*;
import java.util.*;

//함께 블록 쌓기
//25032023

public class b25032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n + 1][h + 1];

        for (int i = 1; i <= n; i++) {

            st = new StringTokenizer(br.readLine());

            dp[i - 1][0] = 1;

            for (int j = 0; j < m; j++) {

                if (!st.hasMoreTokens()) {
                    break;
                }

                int height = Integer.parseInt(st.nextToken());

                for (int j2 = height; j2 <= h; j2++) {
                    dp[i][j2] = (dp[i][j2] + dp[i - 1][j2 - height]) % 10007;
                }
            }

            for (int k = 1; k <= h; k++) {
                dp[i][k] = (dp[i][k] + dp[i - 1][k]) % 10007;
            }
        }

        /*for (int j = 0; j < dp.length; j++) {
            System.out.println();
            for (int j2 = 0; j2 < dp[0].length; j2++) {
                System.out.print(dp[j][j2] + " ");
            }
        }*/

        System.out.println(dp[n][h]);
    }
}
