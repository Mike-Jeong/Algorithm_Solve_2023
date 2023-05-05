package backjoon;

import java.io.*;
import java.util.*;

//거스름돈
//05052023

public class b05052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[100001];

        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 6; i <= n; i++) {

            if (dp[i - 2] == -1 && dp[i - 5] == -1) {
                dp[i] = -1;
            } else if (dp[i - 2] == -1) {
                dp[i] = dp[i - 5] + 1;
            } else if (dp[i - 5] == -1) {
                dp[i] = dp[i - 2] + 1;
            } else {
                dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1;
            }
        }

        System.out.println(dp[n]);

    }
}
