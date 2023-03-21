package backjoon;

import java.io.*;
import java.util.*;

//Selling CPUs
//21032023

public class b21032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] prices = new int[c + 1][m + 1];

        for (int i = 1; i <= m; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= c; j++) {
                prices[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[c + 1][m + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= c; j++) {
                for (int j2 = c - j; j2 >= 0; j2--) {
                    dp[j + j2][i] = Math.max(dp[j + j2][i], dp[j2][i - 1] + prices[j][i]);
                }
            }
        }

        System.out.println(dp[c][m]);
    }
}
