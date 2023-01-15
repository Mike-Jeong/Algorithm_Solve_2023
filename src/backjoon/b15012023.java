package backjoon;

import java.io.*;
import java.util.*;

//오등큰수
//15012023

public class b15012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        int[] numCount = new int[1000001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            numCount[nums[i]]++;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && numCount[nums[stack.peek()]] < numCount[nums[i]]) {
                nums[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(nums[i]).append(' ');
        }

        System.out.println(sb);

    }
}