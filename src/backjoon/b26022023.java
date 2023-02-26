package backjoon;

import java.io.*;
import java.util.*;

//카드 구매하기
//26022023

public class b26022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] prices = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = prices[i];

            for (int j = i - 1; j >= i / 2; j--) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
            }
        }

        System.out.println(dp[n]);
    }
}
