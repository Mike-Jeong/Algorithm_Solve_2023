package backjoon;

import java.io.*;
import java.util.*;

//피자 (Small)
//06062023

public class b06062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 1) {

            System.out.println(0);

            return;

        }

        if (n == 2) {

            System.out.println(1);

            return;

        }

        long[] dp = new long[n + 1];

        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {

            dp[i] = (i / 2) * ((i / 2) + (i % 2)) + dp[i / 2] + dp[(i / 2) + (i % 2)];

        }

        System.out.println(dp[n]);

    }

}
