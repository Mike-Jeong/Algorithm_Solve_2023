package backjoon;

import java.io.*;
import java.util.*;

//좌표 정렬하기 2
//21042023

public class b21042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] positions = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            positions[i][0] = Integer.parseInt(st.nextToken());
            positions[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(positions, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }

        });

        for (int i = 0; i < n; i++) {
            sb.append(positions[i][0]).append(" ").append(positions[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}
