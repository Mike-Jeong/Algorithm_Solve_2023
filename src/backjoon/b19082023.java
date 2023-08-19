package backjoon;

import java.io.*;
import java.util.*;

//윤년
//19082023

public class b19082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println((n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) ? 1 : 0);

    }
}
