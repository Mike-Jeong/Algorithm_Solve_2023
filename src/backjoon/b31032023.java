package backjoon;

import java.io.*;
import java.util.*;

//과자 나눠주기
//31032023

public class b31032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int left = 1;
        int right = 0;

        int[] stick = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            stick[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, stick[i]);
        }

        while (left <= right) {

            int mid = (left + right) / 2;

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += (stick[i] / mid);
            }

            if (sum >= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);

    }
}
