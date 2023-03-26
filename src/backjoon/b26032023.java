package backjoon;

import java.io.*;
import java.util.*;

//Charm Bracelet
//26032023

public class b26032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dp = new int[m + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for (int j = m; j >= w; j--) {
                dp[j] = Math.max(dp[j], dp[j - w] + d);
            }
        }

        System.out.println(dp[m]);
    }
}
