package backjoon;

import java.io.*;
import java.util.*;

//최소공배수
//23042023

public class b23042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(((a * b) / gcd(a, b)));

    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
