package backjoon;

import java.io.*;
import java.util.*;

//스네이크버드
//10072023

public class b10072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        while (true) {
            if (queue.isEmpty() || l < queue.peek()) {
                System.out.println(l);
                return;
            }

            queue.poll();
            l++;
        }
    }
}
