package backjoon;

import java.io.*;
import java.util.*;

//Dairy Queen
//29032023

public class b29032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int j = 0; j < c; j++) {
            st = new StringTokenizer(br.readLine());

            int coin = Integer.parseInt(st.nextToken());

            for (int k = coin; k <= n; k++) {
                dp[k] += dp[k - coin];
            }
        }

        System.out.println(dp[n]);
    }
}
