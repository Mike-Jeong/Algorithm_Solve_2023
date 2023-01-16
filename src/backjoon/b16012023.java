package backjoon;

import java.io.*;
import java.util.*;

//신을 모시는 사당 (쇼미 더 코드 2023 다시풀기)
//16012023

public class b16012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];
        int[] nums = new int[n];

        int ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                dp1[i + 1] = dp1[i] + 1;
            } else {
                dp1[i + 1] = dp1[i] - 1;

                if (dp1[i + 1] < 0) {
                    dp1[i + 1] = 0;
                }
            }

            ans = Math.max(ans, dp1[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 2) {
                dp2[i + 1] = dp2[i] + 1;
            } else {
                dp2[i + 1] = dp2[i] - 1;

                if (dp2[i + 1] < 0) {
                    dp2[i + 1] = 0;
                }
            }

            ans = Math.max(ans, dp2[i + 1]);
        }

        System.out.println(ans);

    }
}