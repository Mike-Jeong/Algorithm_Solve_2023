package backjoon;

import java.io.*;
import java.util.*;

//숫자 빈도수
//16072023

public class b16072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int[] nums = new int[10];

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            int num = i;

            while (num > 0) {
                nums[num % 10]++;
                num /= 10;
            }
        }

        System.out.println(nums[d]);
    }
}
