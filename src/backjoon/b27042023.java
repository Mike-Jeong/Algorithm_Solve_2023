package backjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//피보나치 수 4
//27042023

public class b27042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 0 || n == 1) {
            System.out.println(n == 0 ? 0 : 1);
        } else {

            BigInteger first = BigInteger.ZERO;
            BigInteger second = BigInteger.ONE;

            BigInteger ans = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                ans = first.add(second);
                first = second;
                second = ans;
            }

            System.out.println(ans);

        }

    }
}
