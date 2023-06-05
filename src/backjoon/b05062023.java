package backjoon;

import java.io.*;
import java.util.*;

//피보나치는 지겨웡~
//05062023

public class b05062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 1 || n == 0) {

            System.out.println(1);

            return;

        }

        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = (dp[i - 1] + dp[i - 2] + 1) % 1000000007;

        }

        System.out.println(dp[n]);

    }

}
