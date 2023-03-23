package backjoon;

import java.io.*;
import java.util.*;

//배수 공사
//23032023

public class b23032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] dp = new int[x + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int lenght = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            for (int j = x; j > 0; j--) {
                for (int k = 1; k <= quantity; k++) {

                    if (j - lenght * k < 0) {
                        break;
                    }

                    dp[j] += dp[j - lenght * k];
                }
            }

            /*System.out.println();
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[j] + " ");
            }
            System.out.println();*/

        }

        System.out.println(dp[x]);
    }
}
