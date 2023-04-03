package backjoon;

import java.io.*;
import java.util.*;

//파닭파닭
//03042023

public class b03042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sizes = new int[s];

        long left = 1;
        long right = 0;

        long totalSum = 0;
        for (int i = 0; i < s; i++) {
            st = new StringTokenizer(br.readLine());

            sizes[i] = Integer.parseInt(st.nextToken());
            totalSum += sizes[i];

            right = Math.max(right, sizes[i]);
        }

        long lenght = 0;
        while (left <= right) {

            long mid = (left + right) / 2;

            long sum = 0;

            for (int i = 0; i < s; i++) {

                sum += (sizes[i] / mid);

            }

            if (sum < c) {
                right = mid - 1;
            } else {
                lenght = Math.max(lenght, mid);
                left = mid + 1;
            }

        }

        System.out.println(totalSum - (c * lenght));

    }
}
