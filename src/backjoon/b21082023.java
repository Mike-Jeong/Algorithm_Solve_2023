package backjoon;

import java.io.*;
import java.util.*;

//팩토리얼
//21082023

public class b21082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int[] nums = new int[13];

        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 6;
        nums[4] = 24;
        nums[5] = 120;
        nums[6] = 720;
        nums[7] = 5040;
        nums[8] = 40320;
        nums[9] = 362880;
        nums[10] = 3628800;
        nums[11] = 39916800;
        nums[12] = 479001600;

        int n = Integer.parseInt(st.nextToken());

        System.out.println(nums[n]);

    }
}
