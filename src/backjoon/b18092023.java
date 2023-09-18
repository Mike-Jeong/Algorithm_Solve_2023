package backjoon;

import java.io.*;
import java.util.*;

//스위트콘 가격 구하기
//18092023

public class b18092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(st.nextToken());

        System.out.print((n / 11) * 10);
    }
}
