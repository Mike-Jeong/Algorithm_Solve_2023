package backjoon;

import java.io.*;
import java.util.*;

//히스토그램
//09012023

public class b09012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] heights = new int[n];

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            heights[i] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {

                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - 1 - stack.peek();

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - 1 - stack.peek();
            maxArea = Math.max(maxArea, width * height);
        }

        System.out.println(maxArea);
    }
}

// https://st-lab.tistory.com/255
// 해당 블로그의 풀이법 참조