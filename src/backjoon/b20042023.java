package backjoon;

import java.io.*;
import java.util.*;

//단어 뒤집기 2
//20042023

public class b20042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        boolean opentag = false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '<') {

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                sb.append(s.charAt(i));
                opentag = true;
                continue;
            }

            if (opentag) {

                sb.append(s.charAt(i));

                if (s.charAt(i) == '>') {
                    opentag = false;
                }

                continue;
            }

            if (s.charAt(i) == ' ') {

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                sb.append(' ');

                continue;
            }

            stack.add(s.charAt(i));

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}
