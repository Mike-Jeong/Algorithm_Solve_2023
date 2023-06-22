package backjoon;

import java.io.*;
import java.util.*;

//중복된 숫자
//22062023

public class b22062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        long sum = ((long) (n - 1) * n) / 2;
        long totalSum = 0

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            totalSum += num;

        }

        System.out.println(totalSum - sum);

    }

}
