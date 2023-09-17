package backjoon;

import java.io.*;
import java.util.*;

//
//17092023

public class b17092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());

        System.out.print(m - n);
        System.out.print(" ");
        System.out.print((m));
    }
}
