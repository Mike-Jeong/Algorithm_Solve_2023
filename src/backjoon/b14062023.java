package backjoon;

import java.io.*;
import java.util.*;

//알고리즘 수업 - 피보나치 수 2
//14062023

public class b14062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int a = 1;
        int b = 1;

        for (int i = 2; i < n; i++) {

            int next = a + b;

            next = next % 1000000007;

            a = b;
            b = next;
        }

        System.out.println(b + " " + (n - 2));

    }
}
