package backjoon;

import java.io.*;
import java.util.*;

//욕심쟁이 판다
//14022023

public class b14022023 {

    static int[][] map;
    static int[][] dp;
    static int[] rowOrder = new int[] { -1, 0, 1, 0 };
    static int[] colOrder = new int[] { 0, -1, 0, 1 };

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, recursion(i, j));
            }
        }

        System.out.println(ans);

    }

    private static int recursion(int x, int y) {
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        dp[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            try {
                if (map[x][y] < map[x + rowOrder[i]][y + colOrder[i]]) {
                    dp[x][y] = Math.max(dp[x][y], recursion(x + rowOrder[i], y + colOrder[i]) + 1);
                }
            } catch (Exception e) {
                continue;
            }
        }

        return dp[x][y];
    }
}