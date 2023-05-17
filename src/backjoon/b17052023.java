package backjoon;

import java.io.*;
import java.util.*;

//막대기
//17052023

public class b17052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println(Integer.bitCount(n));

    }
}
