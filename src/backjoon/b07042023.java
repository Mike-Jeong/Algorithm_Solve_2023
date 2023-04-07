package backjoon;

import java.io.*;
import java.util.*;

//저울
//07042023

public class b07042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        boolean[][] dp = new boolean[n + 1][n + 1];

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int d = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            dp[d][a] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int j2 = 1; j2 <= n; j2++) {
                    if (dp[j][i] && dp[i][j2]) {
                        dp[j][j2] = true;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= n; j++) {
                if (dp[i][j] || dp[j][i]) {
                    count++;
                }
            }

            sb.append(n - count - 1).append("\n");
        }

        System.out.println(sb);

        /*
         * System.out.println();
         * 
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++) {
         * 
         * System.out.print(dp[i][j] + " ");
         * }
         * System.out.print("\n");
         * }
         */

    }

}
