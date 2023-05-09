package backjoon;

import java.io.*;
import java.util.*;

//분수 합
//09052023

public class b09052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numerator = (a * d) + (c * b);
        int denominator = (b * d);

        int mod = gcd(numerator, denominator);
        numerator /= mod;
        denominator /= mod;

        System.out.println(numerator + " " + denominator);

    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
