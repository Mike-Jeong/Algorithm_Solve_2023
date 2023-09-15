package backjoon;

import java.io.*;
import java.util.*;

//성택이의 은밀한 비밀번호
//15092023

public class b15092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String p = st.nextToken();

            System.out.println((p.length() >= 6 && p.length() <= 9) ? "yes" : "no");
        }
    }
}
