package backjoon;

import java.io.*;
import java.util.*;

//자료구조는 정말 최고야
//28042023

public class b28042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean check = true;

        loop: for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());

            int max = n;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {

                int current = Integer.parseInt(st.nextToken());

                if (current > max) {
                    check = false;
                    break loop;
                }

                max = current;

            }
        }

        System.out.println(check ? "Yes" : "No");

    }
}
