package backjoon;

import java.io.*;
import java.util.*;

//
//29082023

public class b29082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println(n == 0 ? "YONSEI" : "Leading the Way to the Future");

    }
}
