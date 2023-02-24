package backjoon;

import java.io.*;
import java.util.*;

//종이 접기
//24022023

public class b24022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {

            String s = br.readLine();

            if (s.length() == 1) {
                sb.append("YES").append("\n");
                continue;
            }

            boolean result = check(0, s.length() / 2, s.length() - 1, s);

            sb.append(result ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);

    }

    private static boolean check(int start, int mid, int end, String s) {

        if (mid == 0) {
            return true;
        }
        int sp = start;
        int ep = end;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(sp++) == s.charAt(ep--)) {
                return false;
            }
        }
        return check(start, mid / 2, mid - 1, s);
    }
}