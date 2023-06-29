package backjoon;

import java.io.*;
import java.util.*;

//오늘도 졌다
//29062023

public class b29062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            totalSum += nums[i];
        }

        Arrays.sort(nums);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= nums[i];
            ans += (nums[i] * totalSum);
        }

        System.out.println(ans);

    }
}
