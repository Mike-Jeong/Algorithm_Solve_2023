package backjoon;

import java.io.*;
import java.util.*;

//하노이 탑 이동 순서
//06012023

public class b06012023 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        sb.append((int) Math.pow(2, n) - 1).append("\n");

        hanoi(n, 1, 2, 3);

        System.out.println(sb.toString());

    }

    static void hanoi(int n, int start, int mid, int end) {

        if (n == 1) {
            sb.append(start + " " + end).append("\n");

            return;
        }

        hanoi(n - 1, start, end, mid);

        sb.append(start + " " + end).append("\n");

        hanoi(n - 1, mid, start, end);

    }
}