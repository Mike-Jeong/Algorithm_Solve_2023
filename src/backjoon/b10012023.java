package backjoon;

import java.io.*;
import java.util.*;

//스카이라인 쉬운거
//10012023

public class b10012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] positions = new int[n][2];
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            positions[i][0] = Integer.parseInt(st.nextToken());
            positions[i][1] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek() > positions[i][1]) {
                count++;
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek() == positions[i][1]) {
                continue;
            }

            stack.add(positions[i][1]);

        }

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}