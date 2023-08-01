package backjoon;

import java.io.*;
import java.util.*;

//검증수
//01082023

public class b01082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            sum += (n * n);
        }

        System.out.println(sum % 10);

    }
}
