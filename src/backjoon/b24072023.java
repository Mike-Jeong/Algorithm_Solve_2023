package backjoon;

import java.io.*;
import java.util.*;

//왕복
//24072023

public class b24072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        int[] nums = new int[n];
        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            sum += nums[i];

            if (sum > k) {
                System.out.println(i + 1);
                return;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            if (sum > k) {
                System.out.println(i + 1);
                return;
            }
        }

    }
}
