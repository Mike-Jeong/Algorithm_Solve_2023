package backjoon;

import java.io.*;
import java.util.*;

//보석 상자
//30032023

public class b30032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] colors = new int[m];

        int left = 1;
        int right = 0;

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            colors[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, colors[i]);

        }

        while (left <= right) {

            int mid = (left + right) / 2;

            int sum = 0;

            for (int i = 0; i < m; i++) {
                sum += (colors[i] / mid);

                if (colors[i] % mid != 0) {
                    sum++;
                }
            }

            if (sum > n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(left);

    }
}
