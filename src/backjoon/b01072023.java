package backjoon;

import java.io.*;
import java.util.*;

//수들의 합 5
//01072023

public class b01072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int left = 1;
        int right = 1;

        int sum = 1;
        int count = 0;
        while (left <= right) {

            if (sum == n) {
                count++;
            }

            if (sum < n) {
                right++;
                sum += right;
                continue;
            } else if (sum >= n) {
                sum -= left;
                left++;
            }
        }

        System.out.println(count);

    }
}
