package backjoon;

import java.io.*;
import java.util.*;

//Router
//11052023

public class b11052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            if (num == -1) {
                break;
            }

            if (num == 0) {
                queue.poll();
                continue;
            }

            if (queue.size() < n) {
                queue.add(num);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("empty");
        } else {

            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");
            }

            System.out.println(sb);
        }

    }
}
