package backjoon;

import java.io.*;
import java.util.*;

//백남이의 여행 준비
//19032023

public class b19032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] things = new int[n + 1][2];
        int[] dp = new int[1000001];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            things[i][0] = Integer.parseInt(st.nextToken());
            things[i][1] = Integer.parseInt(st.nextToken());

            for (int j = 1000000; j >= things[i][0]; j--) {
                dp[j] = Math.max(dp[j], dp[j - things[i][0]] + things[i][1]);
            }
        }

        long maxBag = 1000000;
        long maxValue = 0;

        int ans = 0;
        for (int i = 1; i <= m; i++) {

            st = new StringTokenizer(br.readLine());

            int bag = Integer.parseInt(st.nextToken());

            if (maxValue * bag < maxBag * dp[bag]) {
                maxBag = bag;
                maxValue = dp[bag];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
