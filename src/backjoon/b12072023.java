package backjoon;

import java.io.*;
import java.util.*;

//정열적인 정렬
//12072023

public class b12072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}
