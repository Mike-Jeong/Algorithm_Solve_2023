package backjoon;

import java.io.*;
import java.util.*;

//색종이 - 2
//02032023

public class b02032023 {

    static boolean[][] map;
    static int[] rowOrder = {1,0,-1,0};
	static int[] colOrder = {0,1,0,-1};

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

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (check(i, j)) {
                    count++;
                }
            }
        }

        System.out.println(count);

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.print(map[i][j]);
            }

            System.out.print("\n");
        }
    }
}
