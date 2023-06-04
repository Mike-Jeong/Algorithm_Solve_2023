package backjoon;

import java.io.*;
import java.util.*;

//점화식
//04062023

public class b04062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        int a = 1;
        int b;

        while (true) {

            if ((k - dp[n - 3] * a) % dp[n - 2] == 0) {

                b = (k - dp[n - 3] * a) / dp[n - 2];

                break;

            }

            a++;

        }

        System.out.println(a);
        System.out.println(b);

    }

}
