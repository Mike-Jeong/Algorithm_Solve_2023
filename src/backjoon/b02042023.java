package backjoon;

import java.io.*;
import java.util.*;

//Hunger Games
//02042023

public class b02042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());

            int[][] weapons = new int[n][2];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                weapons[i][0] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                weapons[i][1] = Integer.parseInt(st.nextToken());
            }

            int[] dp = new int[w + 1];
            for (int i = 0; i < n; i++) {

                for (int j = w; j >= weapons[i][0]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - weapons[i][0]] + weapons[i][1]);
                }
            }

            sb.append(dp[w]).append("\n");
        }

        System.out.println(sb);

    }
}
