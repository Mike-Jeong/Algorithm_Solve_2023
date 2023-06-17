package backjoon;

import java.io.*;
import java.util.*;

//주몽
//17062023

public class b17062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int count = 0;

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int target = Integer.parseInt(st.nextToken());

            if (set.contains(m - target)) {
                count++;
            }

            set.add(target);

        }

        System.out.println(count);

    }
}
