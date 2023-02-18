package backjoon;

import java.io.*;
import java.util.*;

//보석 도둑
//18022023

public class b18022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] jewels = new int[n][2];
        int[] bags = new int[k];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            jewels[i][0] = Integer.parseInt(st.nextToken());
            jewels[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            bags[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(jewels, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }

        });
        Arrays.sort(bags);

        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }

        });

        int jewelIndex = 0;
        long ans = 0;
        for (int i = 0; i < bags.length; i++) {

            while (jewelIndex < n && bags[i] >= jewels[jewelIndex][0]) {
                queue.add(jewels[jewelIndex]);
                jewelIndex++;
            }

            if (!queue.isEmpty()) {
                ans += queue.poll()[1];
            }
        }

        System.out.println(ans);

    }
}