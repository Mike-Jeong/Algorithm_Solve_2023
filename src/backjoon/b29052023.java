package backjoon;

import java.io.*;
import java.util.*;

//문자열
//29052023

public class b29052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringBuilder sb = new StringBuilder();

        String a = st.nextToken();
        String b = st.nextToken();

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= (b.length() - a.length()); i++) {
            
            int count = 0;

            for (int j = 0; j < a.length(); j++) {

                if (a.charAt(j) == b.charAt(i + j)) {
                    count++;
                }

            }

            ans = Math.min(ans, a.length() - count);
            
        }

        System.out.println(ans);

    }
}
