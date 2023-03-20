package backjoon;

import java.io.*;
import java.util.*;

//최대 페이지 수
//20032023

public class b20032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int days = Integer.parseInt(st.nextToken());
            int pages = Integer.parseInt(st.nextToken());

            if (days > n) {
                continue;
            }

            for (int j = n; j >= days; j--) {
                dp[j] = Math.max(dp[j], dp[j - days] + pages);
            }

        }

        System.out.println(dp[n]);
    }
}
