package backjoon;

import java.io.*;
import java.util.*;

//이상한 기호
//24082023

public class b24082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long ans = (a + b) * (a - b);

        System.out.println(ans);
    }
}
