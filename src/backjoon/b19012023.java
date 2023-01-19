package backjoon;

import java.io.*;
import java.util.*;

//미팅
//19012023

public class b19012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] w = new int[c + 1][c + 1];

        for (int i = 1; i <= c; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= c; j++) {
                w[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] aPersonality = new int[n + 1];
        int[] bPersonality = new int[m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            aPersonality[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= m; i++) {
            bPersonality[i] = Integer.parseInt(st.nextToken());
        }

        long[][] dp = new long[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + w[aPersonality[i]][bPersonality[j]],
                        Math.max(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        System.out.println(dp[n][m]);

    }
}
