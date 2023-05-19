package backjoon;

import java.io.*;
import java.util.*;

//팔
//19052023

public class b19052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String left = st.nextToken();
        String right = st.nextToken();

        int count = 0;

        if (left.length() == right.length()) {

            for (int i = 0; i < left.length(); i++) {

                if (left.charAt(i) != right.charAt(i)) {
                    break;
                }

                if (left.charAt(i) == '8') {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
