package backjoon;

import java.io.*;
import java.util.*;

//히스토그램에서 가장 큰 직사각형
//08012023

public class b08012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;// = new StringTokenizer(br.readLine());

        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] heights = new int[n];

            if (n == 0) {
                break;
            }

            Stack<Integer> stack = new Stack<>();

            long maxArea = 0;

            for (int i = 0; i < n; i++) {

                heights[i] = Integer.parseInt(st.nextToken());

                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {

                    int height = heights[stack.pop()];
                    long width = stack.isEmpty() ? i : i - 1 - stack.peek(); 

                    maxArea = Math.max(maxArea, height * width);
                }

                stack.push(i);
            }

            while(!stack.isEmpty()) {
                int height = heights[stack.pop()];
                long width = stack.isEmpty() ? n: n - 1 - stack.peek();
                maxArea = Math.max(maxArea, width * height);
            }

            System.out.println(maxArea);

        }
    }
}

//https://st-lab.tistory.com/255
//해당 블로그의 풀이법 참조