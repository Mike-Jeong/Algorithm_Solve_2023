package backjoon;

import java.io.*;
import java.util.*;

//도넛 행성 (쇼미 더 코드 2023 다시풀기)
//21012023

public class b21012023 {

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;

    static int[] rowOrder = new int[] { -1, 0, 1, 0 };
    static int[] colOrder = new int[] { 0, -1, 0, 1 };

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    check(i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

    private static void check(int r, int c) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] { r, c });

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            if (!visited[current[0]][current[1]]) {

                visited[current[0]][current[1]] = true;

                for (int i = 0; i < 4; i++) {
                    int nextR = current[0] + rowOrder[i];
                    if (nextR >= n) {
                        nextR = (nextR % n);
                    }

                    if (nextR < 0) {
                        nextR = (n + nextR);
                    }
                    int nextC = current[1] + colOrder[i];
                    if (nextC >= m) {
                        nextC = (nextC % m);
                    }

                    if (nextC < 0) {
                        nextC = (m + nextC);
                    }

                    if (map[nextR][nextC] == 0 && !visited[nextR][nextC]) {
                        queue.add(new int[] { nextR, nextC });
                    }

                }

            }

        }

    }
}