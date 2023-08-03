package backjoon;

import java.io.*;
import java.util.*;

//과제 안 내신 분..?
//03082023

public class b03082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        boolean[] check = new boolean[31];
        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            check[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!check[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }
}
