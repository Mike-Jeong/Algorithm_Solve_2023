package backjoon;

import java.io.*;
import java.util.*;

//곱셈
//23022023

public class b23022023 {

    static long c;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(recursion(a, b));

    }

    public static long recursion(long a, long b) {

        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a % c;
        }

        long n = recursion(a, b / 2) % c;

        return b % 2 == 0 ? ((n * n) % c) : ((((n * n) % c) * a) % c);

    }
}