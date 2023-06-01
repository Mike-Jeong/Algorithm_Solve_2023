package backjoon;

import java.io.*;
import java.util.*;

//점프
//01062023

public class b01062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            nums[i] = Integer.parseInt(st.nextToken());

            max = Math.max(max, nums[i]);
        }

        long[] dp = new long[max + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= max; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dp[nums[i]]);
        }
    }

}
