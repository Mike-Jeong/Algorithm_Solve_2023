package backjoon;

import java.io.*;
import java.util.*;

//오름세
//23012023

public class b23012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String nInput = null;
        while ((nInput = br.readLine()) != null) {
        
            int n = Integer.parseInt(nInput.trim());
            int[] nums = new int[n];
            int[] dp = new int[n];
            List<Integer> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            nums[0] = Integer.parseInt(st.nextToken());
            dp[0] = 1;
            list.add(nums[0]);
            int max = 1;

            for (int i = 1; i < n; i++) {

                nums[i] = Integer.parseInt(st.nextToken());

                if (list.get(list.size() - 1) > nums[i]) {

                    int left = 0;
                    int right = list.size() - 1;

                    while (left < right) {

                        int mid = (left + right) / 2;

                        if (list.get(mid) >= nums[i]) {
                            right = mid;
                        } else {
                            left = mid + 1;
                        }
                    }

                    list.set(right, nums[i]);
                    dp[i] = right + 1;

                } else {

                    if (list.get(list.size() - 1) < nums[i]) {
                        list.add(nums[i]);
                    }

                    dp[i] = list.size();
                }

                max = Math.max(max, dp[i]);
            }
            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}