package backjoon;

import java.io.*;
import java.util.*;

//점수 계산
//04052023

public class b04052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }

        });

        for (int i = 1; i <= 8; i++) {
            st = new StringTokenizer(br.readLine());
            queue.add(new int[] { i, Integer.parseInt(st.nextToken()) });
        }

        Queue<int[]> queue2 = new PriorityQueue<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }

        });

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += queue.peek()[1];
            queue2.add(queue.poll());
        }

        System.out.println(sum);
        while (!queue2.isEmpty()) {
            sb.append(queue2.poll()[0]).append(" ");
        }
        System.out.println(sb);

    }
}
