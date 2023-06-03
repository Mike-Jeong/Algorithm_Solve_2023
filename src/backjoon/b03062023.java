package backjoon;

import java.io.*;
import java.util.*;

//점화식
//03062023

public class b03062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        long[] dp = new long[n + 1];

        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                dp[i] += (dp[j] * dp[i - 1 - j]);
            }

        }

        System.out.println(dp[n]);
    }

}
