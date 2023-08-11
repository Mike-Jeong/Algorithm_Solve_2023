package backjoon;

import java.io.*;
import java.util.*;

//펠린드롬수
//11082023

public class b11082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            if ("0".equals(s)) {
                System.out.println(sb);
                return;
            }

            boolean check = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    check = false;
                    break;
                }
            }

            sb.append(check ? "yes" : "no").append("\n");
        }

    }
}
