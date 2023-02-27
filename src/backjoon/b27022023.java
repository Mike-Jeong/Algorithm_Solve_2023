package backjoon;

import java.io.*;
import java.util.*;

//에디터
//27022023

public class b27022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stackL.add(s.charAt(i));
        }

        for (int i = 0; i < n; i++) {

            String c = br.readLine();

            switch (c.charAt(0)) {
                case 'L':
                    if (!stackL.isEmpty())
                        stackR.push(stackL.pop());

                    break;

                case 'D':
                    if (!stackR.isEmpty())
                        stackL.push(stackR.pop());

                    break;

                case 'B':
                    if (!stackL.isEmpty()) {
                        stackL.pop();
                    }
                    break;

                case 'P':
                    char t = c.charAt(2);
                    stackL.push(t);
                    break;

                default:
                    break;

            }
        }

        while (!stackL.isEmpty()) {
            stackR.push(stackL.pop());
        }

        while (!stackR.isEmpty()) {
            sb.append(stackR.pop());
        }

        System.out.println(sb);

    }
}
