package backjoon;

import java.io.*;
import java.util.*;

//색종이 - 2
//02032023

public class b02032023 {

    static boolean[][] map;
    static int[] rowOrder = { 1, 0, -1, 0 };
    static int[] colOrder = { 0, 1, 0, -1 };
    static int count = 0;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        map = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {

                    map[j + r][j2 + c] = true;

                }
            }
        }

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                check(i, j);
            }
        }

        System.out.println(count);
    }

    private static void check(int r, int c) {

        if (!map[r][c]) {
            return;
        }

        for (int i = 0; i < 4; i++) {

            if (0 <= r + rowOrder[i] && r + rowOrder[i] < 100 && 0 <= c + colOrder[i] && c + colOrder[i] < 100
                    && !map[r + rowOrder[i]][c + colOrder[i]]) {
                count++;
            }

            if (0 > r + rowOrder[i]) {
                count++;
            }

            if (0 > c + colOrder[i]) {
                count++;
            }

            if (100 <= r + rowOrder[i]) {
                count++;
            }

            if (100 <= c + colOrder[i]) {
                count++;
            }
        }
    }
}
