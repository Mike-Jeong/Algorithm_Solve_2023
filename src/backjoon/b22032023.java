package backjoon;

import java.io.*;
import java.util.*;

//Transport
//22032023

public class b22032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {
            
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int tw = Integer.parseInt(st.nextToken());

            int[] dp = new int[tw + 1];

            for (int i = 0; i < n; i++) {

                st = new StringTokenizer(br.readLine());

                int w = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                for (int j = tw; j >= w; j--) {
                    dp[j] = Math.max(dp[j], dp[j - w] + v);
                }
            }

            System.out.println(dp[tw]);
        }
    }
}
