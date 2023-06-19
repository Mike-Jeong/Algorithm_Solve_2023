package backjoon;

import java.io.*;
import java.util.*;

//등수 매기기
//19062023

public class b19062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[n + 1];

        for (int i = 1; i < nums.length; i++) {

            st = new StringTokenizer(br.readLine());

            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        long ans = 0;

        for (int i = 1; i < nums.length; i++) {
            ans += (Math.abs(nums[i] - i));
        }

        System.out.println(ans);

    }
}
