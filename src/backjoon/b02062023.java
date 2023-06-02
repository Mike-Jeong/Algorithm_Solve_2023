package backjoon;

import java.io.*;
import java.util.*;

//1, 2, 3 더하기 4
//02062023

public class b02062023 {

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
        dp[3] = 3;

        double count = 6;

        for (int i = 4; i <= max; i++) {

            count = count / 2;

            dp[i] = (dp[i - 3] + (int) count) % 1000000009;

            count = count * 2;
            
            count++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dp[nums[i]]);
        }
    }

}
