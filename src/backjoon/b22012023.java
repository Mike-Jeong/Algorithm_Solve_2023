package backjoon;

import java.io.*;
import java.util.*;

//수열 정렬
//22012023

public class b22012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arrA = new int[n];
        int[] temp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            arrA[i] = Integer.parseInt(st.nextToken());

            for (int j = 0; j < i; j++) {
                temp[arrA[j] > arrA[i] ? j : i]++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}