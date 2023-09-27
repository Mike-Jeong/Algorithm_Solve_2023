package backjoon;

import java.io.*;
import java.util.*;

//나는 행복합니다~
//27092023

public class b27092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        // int n = Integer.parseInt(st.nextToken());
        st.nextToken();
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println((k / m) + " " + (k % m));
    }
}
