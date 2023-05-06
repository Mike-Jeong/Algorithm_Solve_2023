package backjoon;

import java.io.*;
import java.util.*;

//붙임성 좋은 총총이
//06052023

public class b06052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        boolean findChong = false;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();

            if ("ChongChong".equals(a) || "ChongChong".equals(b)) {
                findChong = true;
                set.add("ChongChong");
            }

            if (findChong) {
                if (set.contains(a)) {
                    set.add(b);
                } else if (set.contains(b)) {
                    set.add(a);
                }
            }
        }

        System.out.println(set.size());

    }
}
