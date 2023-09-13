package backjoon;

import java.io.*;
import java.util.*;

//큰 수 (BIG)
//13092023

public class b13092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();

        long temp = 0;
        for (int i = 0; i < s.length(); i++) {
        	temp = (temp * 10 + (s.charAt(i) - '0')) % 20000303;
        }
    
        System.out.println(temp);
    }
}
