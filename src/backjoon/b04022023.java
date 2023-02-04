package backjoon;

import java.io.*;
import java.util.*;

//구간 나누기 2
//04022023

public class b04022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        int left = 0;
        int right = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, nums[i]);
        }

        while (left < right) {

            int mid = (left + right) / 2;

            if (check(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);

    }

    private static boolean check(int[] nums, int maxDiff, int size) {

        int min = nums[0];
        int max = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            if (max - min > maxDiff) {
                count++;
                min = nums[i];
                max = nums[i];
            }
        }

        return (count <= size);
    }
}
