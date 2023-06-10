package backjoon;

import java.io.*;
import java.util.*;

//소수
//10062023

public class b10062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int result = a % b;

        for (int i = 0; i < n - 1; i++) {
            result *= 10;
            result %= b;
        }

        result *= 10;

        System.out.println(result / b);

    }

}
