package backjoon;

import java.io.*;
import java.util.*;

//폴리오미노
//11062023

public class b11062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();

        s = s.replace("XXXX", "AAAA");
        s = s.replace("XX", "BB");

        if (s.contains("X")) {
            System.out.println(-1);
            return;
        }

        System.out.println(s);

    }

}
