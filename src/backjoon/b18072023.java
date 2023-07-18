package backjoon;

import java.io.*;
import java.util.*;

//사탕
//18072023

public class b18072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());

        for (int tc = 0; tc < t; tc++) {
            st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[][] boxes = new int[n][2];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                boxes[i][0] = Integer.parseInt(st.nextToken());
                boxes[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(boxes, new Comparator<int[]>() {

                @Override
                public int compare(int[] o1, int[] o2) {

                    return o2[0] * o2[1] - o1[0] * o1[1];
                }

            });

            int count = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (boxes[i][0] * boxes[i][1]);
                count++;
                if (sum >= j) {
                    break;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);

    }
}
