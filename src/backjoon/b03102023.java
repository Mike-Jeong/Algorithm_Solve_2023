package backjoon;

import java.io.*;
import java.util.*;

//코딩은 체육과목 입니다
//03102023

public class b03102023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n / 4; i++) {
            sb.append("long").append(" ");
        }

        sb.append("int");

        System.out.println(sb);

    }
}
