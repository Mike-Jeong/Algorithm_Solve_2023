package backjoon;

import java.io.*;
import java.util.*;

//배열 합치기
//07032023

public class b07032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n + m];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            nums[i + n] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            sb.append(nums[j]).append(" ");
        }
        System.out.println(sb);
    }
}
// Arrays.sort() 함수 사용
