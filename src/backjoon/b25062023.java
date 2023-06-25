package backjoon;

import java.io.*;
import java.util.*;

//투명
//25062023

public class b25062023 {

    private static int[][] map = new int[101][101];
    private static int m;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            check(x1, y1, x2, y2);
        }

        System.out.println(solve());

    }

    private static void check(int x1, int y1, int x2, int y2) {

        for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <= x2; j++) {
                map[i][j]++;
            }
        }

    }

    private static int solve() {

        int ans = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (map[i][j] > m) {
                    ans++;
                }
            }
        }

        return ans;
    }

}
