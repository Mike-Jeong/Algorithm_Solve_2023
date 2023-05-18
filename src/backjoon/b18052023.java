package backjoon;

import java.io.*;
import java.util.*;

//친구
//18052023

public class b18052023 {

    private static final int INF = 987654321;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) == 'Y' ? 1 : INF;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < map.length; i++) {

            int count = 0;

            for (int j = 0; j < map.length; j++) {

                if (3 > map[i][j]) {
                    count++;
                }
            }

            ans = Math.max(ans, count - 1);

        }

        System.out.println(ans);
        
    }
}
