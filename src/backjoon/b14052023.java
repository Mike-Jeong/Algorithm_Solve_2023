package backjoon;

import java.io.*;
import java.util.*;

//수 정렬하기 5
//14052023

public class b14052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            sb.append(nums[i]).append("\n");
        }

        System.out.println(sb);

    }
}
