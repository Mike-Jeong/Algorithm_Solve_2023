package backjoon;

import java.io.*;
import java.util.*;

//다이나믹이 뭐예요?
//16042023

public class b16042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[][] dp = new long[n + 1][m + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
            }
        }

        System.out.println(dp[n][m]);

    }
}
