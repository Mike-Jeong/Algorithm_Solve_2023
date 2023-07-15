package backjoon;

import java.io.*;
import java.util.*;

//부분 문자열
//15072023

public class b15072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String string;

        while ((string = br.readLine()) != null) {

            st = new StringTokenizer(string);

            String s = st.nextToken();
            String t = st.nextToken();

            int index = 0;

            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(index) == t.charAt(i)) {
                    index++;
                }

                if (index == s.length()) {
                    break;
                }
            }

            sb.append(index == s.length() ? "Yes" : "No").append("\n");
        }

        System.out.println(sb);
    }
}
