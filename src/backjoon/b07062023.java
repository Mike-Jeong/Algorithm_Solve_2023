package backjoon;

import java.io.*;
import java.util.*;

//펠린드롬 만들기
//07062023

public class b07062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alpha[((int) s.charAt(i)) - 65]++;
        }

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < alpha.length; i++) {

            for (int j = 0; j < alpha[i] / 2; j++) {
                stack.add((char) (i + 65));
                sb.append((char) (i + 65));
            }

            if (alpha[i] % 2 != 0) {
                queue.add((char) (i + 65));
            }
        }

        if (queue.size() > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        if (!queue.isEmpty()) {
            sb.append(queue.poll());
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }

}
