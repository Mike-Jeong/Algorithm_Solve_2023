package backjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//피보나치 수
//24052023

public class b24052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println(recursion(n));

    }

    private static BigInteger recursion(int n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c;

        for (int i = 3; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }

        return a;
    }
}
