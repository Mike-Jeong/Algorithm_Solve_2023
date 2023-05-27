package backjoon;

import java.io.*;
import java.util.*;

//문자와 문자열
//27052023

public class b27052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());

        System.out.println(s.charAt(i - 1));

    }
}
