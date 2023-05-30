package backjoon;

import java.io.*;
// import java.util.*;

//칸토어 집합
//30052023

public class b30052023 {

    private static StringBuilder sb;
    private static boolean[] ck;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer s = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s;
        while ((s = br.readLine()) != null) {

            int n = Integer.parseInt(s);

            if (n == 0) {
                System.out.println("-");
                continue;
            }

            int length = (int) Math.pow(3, n);

            ck = new boolean[length];

            sb = new StringBuilder();

            recursion(0, length - 1, length);

            for (int i = 0; i < length; i++) {
                sb.append(ck[i] ? "-" : " ");
            }

            System.out.println(sb);

        }

    }

    private static void recursion(int start, int end, int length) {

        if (length == 1) {
            ck[start] = true;
            return;
        }

        recursion(start, (start + (length / 3) - 1), (length / 3));
        recursion(end - (length / 3) + 1, end, (length / 3));

    }
}
