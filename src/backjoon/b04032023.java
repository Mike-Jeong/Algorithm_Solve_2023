package backjoon;

import java.io.*;
import java.util.*;

//요세푸스 문제
//04032023

public class b04032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        sb.append("<");

        while (!queue.isEmpty()) {

            for (int i = 0; i < m - 1; i++) {
                queue.add(queue.poll());
            }

            sb.append(queue.poll());

            sb.append(queue.isEmpty() ? ">" : ", ");

        }

        System.out.println(sb);
    }
}
