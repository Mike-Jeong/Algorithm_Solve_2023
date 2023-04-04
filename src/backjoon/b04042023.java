package backjoon;

import java.io.*;
import java.util.*;

//Piggy-Bank
//04042023

public class b04042023 {

    private static final int MAX = 500000001;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());

            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            int[] dp = new int[f - e + 1];
            Arrays.fill(dp, MAX);
            dp[0] = 0;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int p = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                for (int j = w; j <= (f - e); j++) {
                    dp[j] = Math.min(dp[j], dp[j - w] + p);
                }

            }

            sb.append(dp[f - e] == MAX ? "This is impossible."
                    : String.format("The minimum amount of money in the piggy-bank is %d.", dp[f - e])).append("\n");

        }

        System.out.println(sb);

    }
}
