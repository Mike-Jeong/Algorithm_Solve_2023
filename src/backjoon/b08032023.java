package backjoon;

import java.io.*;
import java.util.*;

//암기왕
//08032023

public class b08032023 {

    static int[] nums;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            nums = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                sb.append((check(Integer.parseInt(st.nextToken())) ? 1 : 0)).append("\n");
            }
            
        }

        System.out.println(sb);
    }

    private static boolean check(int num) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] <= num) {
                if (nums[mid] == num) {
                    return true;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;

    }
}
