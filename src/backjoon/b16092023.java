package backjoon;

import java.io.*;
import java.util.*;

//세금
//16092023

public class b16092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(st.nextToken());

        System.out.print(n * 78 / 100);
        System.out.print(" ");
        System.out.print((n * 80 / 100) + (((n * 20 / 100) * 78) / 100));
    }
}
