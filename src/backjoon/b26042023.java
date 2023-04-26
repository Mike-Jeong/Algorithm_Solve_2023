package backjoon;

import java.io.*;
import java.util.*;

//피보나치 수 3
//26042023

public class b26042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(st.nextToken());

        long nConvert = n % 1500000;

        long first = 0;
        long second = 1;

        long ans = 1;

        for (int i = 2; i <= nConvert; i++) {
            ans = (first + second) % 1000000;
            first = second;
            second = ans;
        }

        System.out.println(ans);

    }
}

/*
 * 피보나치 수를 나눈 나머지는 항상 주기를 가진다. 이를 피사노 주기(Pisano Period)라 한다.
 * 1000000을 나눈 나머지를 한다는 가정하에 1500000번을 주기로 똑같은 값이 주어진다.
 * https://en.wikipedia.org/wiki/Pisano_period
 */