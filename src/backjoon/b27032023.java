package backjoon;

import java.io.*;
import java.util.*;

//Cow Cash
//27032023

public class b27032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        long[] dp = new long[v + 1];

        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());

            for (int j = c; j <= v; j++) {
                dp[j] += dp[j - c];
            }
        }

        System.out.println(dp[v]);
    }
}
