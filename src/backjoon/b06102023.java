package backjoon;

import java.io.*;
import java.util.*;

//Rats
//06102023

public class b06102023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        System.out.println((((n + 1) * (m + 1)) / (x + 1)) - 1);

    }
}
