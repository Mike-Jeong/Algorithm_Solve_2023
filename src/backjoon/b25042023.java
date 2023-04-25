package backjoon;

import java.io.*;
import java.util.*;

//카드1
//25042023

public class b25042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {

            sb.append(queue.poll()).append(" ");

            if (queue.isEmpty()) {
                break;
            }

            queue.add(queue.poll());
        }

        System.out.println(sb);

    }

}
