package backjoon;

import java.io.*;
import java.util.*;

//돌 게임 2 
//24042023

public class b24042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        System.out.println(n % 2 == 0 ? "SK" : "CY");
    }

}
