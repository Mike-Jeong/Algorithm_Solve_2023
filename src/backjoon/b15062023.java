package backjoon;

import java.io.*;
import java.util.*;

//피보나치 비스무리한 수열
//15062023

public class b15062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 1 || n == 2 || n == 3) {
            System.out.println(1);
            return;
        }

        long[] dp = new long[n + 1];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 3];
        }

        System.out.println(dp[n]);

    }
}
