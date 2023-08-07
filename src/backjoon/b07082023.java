package backjoon;

import java.io.*;
import java.util.*;

//평균
//07082023

public class b07082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        double max = 0;
        double[] nums = new double[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            max = nums[i] > max ? nums[i] : max;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = (nums[i] / max * 100);
            sum += nums[i];
        }

        System.out.println(sum / (double) n);
    }
}
