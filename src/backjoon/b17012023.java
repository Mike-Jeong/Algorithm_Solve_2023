package backjoon;

import java.io.*;
import java.util.*;

//오아시스 재결합
//17012023

public class b17012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        int[] counts = new int[n];

        Stack<Integer> stack = new Stack<>();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                ans += counts[stack.pop()];
            }

            if (!stack.isEmpty() && nums[stack.peek()] == nums[i]) {
                counts[i] = counts[stack.pop()];
                ans += counts[i];
            }

            if (!stack.isEmpty()) {
                ans++;
            }

            counts[i]++;
            stack.push(i);
        }

        System.out.println(ans);

    }
}

// https://nahwasa.com/31
// 다음 블로그 풀이법 참고
// 다시 풀어볼 것!