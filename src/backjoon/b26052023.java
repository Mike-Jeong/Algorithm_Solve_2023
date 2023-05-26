package backjoon;

import java.io.*;
import java.util.*;

//피보나치 수 7
//26052023

public class b26052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            int[] dp = new int[n + 1];

            dp[1] = 1;
            dp[2] = 1;

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
            }

            System.out.println(dp[n]);
        }

    }
}
