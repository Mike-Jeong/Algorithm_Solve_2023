package backjoon;

import java.io.*;
import java.util.*;

//펙토리얼 2
//26082023

public class b26082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        long[] nums = new long[21];

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
        nums[13] = 6227020800l;
        nums[14] = 87178291200l;
        nums[15] = 1307674368000l;
        nums[16] = 20922789888000l;
        nums[17] = 355687428096000l;
        nums[18] = 6402373705728000l;
        nums[19] = 121645100408832000l;
        nums[20] = 2432902008176640000l;

        System.out.println(nums[a]);
    }
}
