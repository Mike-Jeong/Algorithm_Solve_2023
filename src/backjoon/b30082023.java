package backjoon;

import java.io.*;
import java.util.*;

//
//30082023

public class b30082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        n *= 100;

        System.out.println(n >= m ? "Yes" : "No");

    }
}
