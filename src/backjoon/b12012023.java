package backjoon;

import java.io.*;
import java.util.*;

//운동
//12012023

public class b12012023 {

    private static int minVal = 987654321;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int[][] map = new int[v + 1][v + 1];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = minVal;
            }
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            map[a][b] = c;
        }

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                for (int j2 = 1; j2 <= v; j2++) {
                    map[j][j2] = Math.min(map[j][j2], map[j][i] + map[i][j2]);
                }
            }
        }

        for (int i = 1; i <= v; i++) {
            minVal = Math.min(minVal, map[i][i]);
        }

        System.out.println(minVal == 987654321 ? -1 : minVal);

    }
}