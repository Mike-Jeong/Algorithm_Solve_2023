package backjoon;

import java.io.*;
import java.util.*;

//정수 삼각형
//06032023

public class b06032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j <= i; j++) {

                nums[i][j] = Integer.parseInt(st.nextToken());

                if (i == 0) {
                    continue;
                }

                if (j == 0) {
                    nums[i][j] += nums[i - 1][j];
                } else if (j == i) {
                    nums[i][j] += nums[i - 1][j - 1];
                } else {
                    nums[i][j] += Math.max(nums[i - 1][j - 1], nums[i - 1][j]);
                }

            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, nums[n - 1][i]);
        }
        System.out.println(answer);
    }
}
