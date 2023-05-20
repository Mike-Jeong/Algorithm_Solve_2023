package backjoon;

import java.io.*;
import java.util.*;

//상수
//20052023

public class b20052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        Integer b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(Math.max(a, b));

    }
}
