package backjoon;

import java.io.*;
import java.util.*;

//K번째 수
//14042023

public class b14042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[a];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        System.out.println(nums[k - 1]);
    }
}
