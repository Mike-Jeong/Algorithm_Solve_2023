package backjoon;

import java.io.*;
import java.util.*;

//배열 합치기
//07032023

public class b07032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }

        System.out.println(sb);
    }
}
// 우선순위 큐 사용
