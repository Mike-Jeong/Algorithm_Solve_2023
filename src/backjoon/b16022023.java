package backjoon;

import java.io.*;
import java.util.*;

//미로만들기
//16022023

public class b16022023 {

    static int[][] map;
    static int[][] dp;
    static int[] rowOrder = new int[] { -1, 0, 1, 0 };
    static int[] colOrder = new int[] { 0, -1, 0, 1 };

    private static final int INF = 987654321;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - 48;
                dp[i][j] = INF;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 0, 0 });

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            if (dp[cur[0]][cur[1]] > cur[2]) {

                dp[cur[0]][cur[1]] = cur[2];

                for (int i = 0; i < 4; i++) {
                    try {
                        int nextBolckStat = map[cur[0] + rowOrder[i]][cur[1] + colOrder[i]] == 1 ? 0 : 1;
                        if (dp[cur[0] + rowOrder[i]][cur[1] + colOrder[i]] > dp[cur[0]][cur[1]] + nextBolckStat) {

                            queue.add(new int[] { cur[0] + rowOrder[i], cur[1] + colOrder[i],
                                    dp[cur[0]][cur[1]] + nextBolckStat });
                        }

                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}