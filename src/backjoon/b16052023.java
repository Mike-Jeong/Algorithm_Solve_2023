package backjoon;

import java.io.*;
import java.util.*;

//소트
//16052023

public class b16052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            queue.add(Integer.parseInt(st.nextToken()));
        }

        int max = 0;

        while (!queue.isEmpty()) {
            max = Math.max(max, (queue.peek() * queue.size()));
            queue.poll();
        }

        System.out.println(max);

    }
}
