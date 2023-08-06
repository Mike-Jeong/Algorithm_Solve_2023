package backjoon;

import java.io.*;
import java.util.*;

//접미사 배열
//06082023

public class b06082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Queue<String> queue = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.substring(i, s.length()));
        }

        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append("\n");
        }

        System.out.println(sb);
    }
}
