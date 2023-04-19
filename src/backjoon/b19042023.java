package backjoon;

import java.io.*;
import java.util.*;

//균형잡힌 세상
//19042023

public class b19042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s;
        while (!(s = br.readLine()).isBlank()) {

            if (".".equals(s)) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            boolean isStable = true;
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(') {
                    stack.add(')');
                } else if (s.charAt(i) == '[') {
                    stack.add(']');
                }
                {
                    if (s.charAt(i) == ')' || s.charAt(i) == ']') {
                        if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                            isStable = false;
                            break;
                        }
                        stack.pop();
                    }
                }

            }

            sb.append(stack.isEmpty() && isStable ? "yes" : "no").append("\n");

        }

        System.out.println(sb);

    }
}
