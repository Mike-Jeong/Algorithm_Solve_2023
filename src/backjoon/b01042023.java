package backjoon;

import java.io.*;
import java.util.*;

//히오스 프로게이머
//01042023

public class b01042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long left = Integer.MAX_VALUE;
        long right = 2100000000;

        long[] levels = new long[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            levels[i] = Integer.parseInt(st.nextToken());

            if (left > levels[i]) {
                left = levels[i];
            }
        }

        long ans = 0;
        while (left <= right) {

            long mid = (left + right) / 2;

            long sum = 0;

            for (int i = 0; i < n; i++) {

                if (mid > levels[i]) {
                    sum += (mid - levels[i]);
                }
            }

            // System.out.println(left + " " + right + " " + mid + " " + sum);

            if (sum > k) {
                right = mid - 1;
            } else {
                ans = Math.max(ans, mid);
                left = mid + 1;
            }
        }

        System.out.println(ans);

    }
}
