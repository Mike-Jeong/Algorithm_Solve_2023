package backjoon;

import java.io.*;
import java.util.*;

//홍익대학교
//08092023

public class b08092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println(n - 1946);

    }
}
