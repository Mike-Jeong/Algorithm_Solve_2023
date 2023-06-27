package backjoon;

import java.io.*;
import java.util.*;

//성적 통계
//27062023

public class b27062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= tc; i++) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            int[] nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            int largestGap = 0;
            for (int j = n - 1; j >= 1; j--) {
                largestGap = Math.max(largestGap, nums[j] - nums[j - 1]);
            }

            sb.append("Class ").append(i).append("\n");
            sb.append("Max ").append(nums[n - 1]).append(", ");
            sb.append("Min ").append(nums[0]).append(", ");
            sb.append("Largest gap ").append(largestGap).append("\n");
        }

        System.out.println(sb);

    }
}
