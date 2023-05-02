package backjoon;

import java.io.*;
import java.util.*;

//두 수의 합
//02052023

public class b02052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < (x + 1) / 2; i++) {
            if (set.contains(i) && set.contains(x - i)) {
                count++;
            }
        }

        System.out.println(count);

    }
}
