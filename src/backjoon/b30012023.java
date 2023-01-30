package backjoon;

import java.io.*;
import java.util.*;

//줄세우기
//30012023

public class b30012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];

        int max = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int current = Integer.parseInt(st.nextToken());

            if (i == 0) {
                dp[i] = 1;
                list.add(current);
                continue;
            }

            if (list.get(list.size() - 1) > current) {

                int left = 0;
                int right = list.size() - 1;

                while (left < right) {

                    int mid = (left + right) / 2;

                    if (list.get(mid) >= current) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                list.set(right, current);
                dp[i] = right + 1;

            } else {

                if (list.get(list.size() - 1) < current) {
                    list.add(current);
                }

                dp[i] = list.size();

            }

            max = Math.max(max, dp[i]);

        }

        System.out.println(n - max);

    }
}
