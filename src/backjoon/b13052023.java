package backjoon;

import java.io.*;
import java.util.*;

//풍선 터뜨리기
//13052023

public class b13052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] paper = new int[n + 1];
        LinkedList<Integer> deque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            paper[i] = Integer.parseInt(st.nextToken());
            deque.add(i);
        }

        while (true) {

            int current = deque.pollFirst();

            sb.append(current).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            if (paper[current] > 0) {

                for (int i = 0; i < paper[current] - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }

            } else {
                for (int i = paper[current]; i < 0; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }

        }

        System.out.println(sb);

    }
}
