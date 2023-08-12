package backjoon;

import java.io.*;
import java.util.*;

//오르막길
//12082023

public class b12082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (i == 0 || current <= prev) {
                min = current;
                prev = current;
                continue;
            }

            max = Math.max(max, current - min);
            prev =  current;
        }

        System.out.println(max);

    }
}
