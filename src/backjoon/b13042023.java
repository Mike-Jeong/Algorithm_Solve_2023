package backjoon;

import java.io.*;
import java.util.*;

//풍선 공장
//13042023

public class b13042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long left = 1;
        long right = 1000000000000l;

        while (left < right) {

            long mid = (left + right) / 2;

            int count = 0;

            for (int i = 0; i < n; i++) {
                count += (mid / nums[i]);
            }

            // System.out.println(count + " " + mid + " " + right);

            if (count >= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);

    }
}
