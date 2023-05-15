package backjoon;

import java.io.*;
import java.util.*;

//문자열
//15052023

public class b15052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            sb.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n");
        }

        System.out.println(sb);

    }
}
