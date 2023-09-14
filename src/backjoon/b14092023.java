package backjoon;

import java.io.*;
import java.util.*;

//몇개고?
//14092023

public class b14092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Integer t = Integer.parseInt(st.nextToken());
        Integer s = Integer.parseInt(st.nextToken());

        System.out.println((t >= 12 && t <= 16) && s == 0 ? 320 : 280);
    }
}
