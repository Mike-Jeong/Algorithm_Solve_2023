package backjoon;

import java.io.*;
import java.util.*;

//Treasure
//28032023

public class b28032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {

            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int tw = Integer.parseInt(st.nextToken());

            int[] dp = new int[tw + 1];

            for (int j = 0; j < i; j++) {
                st = new StringTokenizer(br.readLine());

                int v = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                for (int k = tw; k >= w; k--) {
                    dp[k] = Math.max(dp[k], dp[k - w] + v);
                }
            }

            sb.append(dp[tw]).append("\n");

        }

        System.out.println(sb);
    }
}
