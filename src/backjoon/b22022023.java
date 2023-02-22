package backjoon;

import java.io.*;
import java.util.*;

//시철이가 사랑한 GCD
//22022023

public class b22022023 {

    static int[] nums;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        nums = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(recursion(0, n - 1));

    }

    public static long recursion(int start, int end) {
        if (end - start == 1) {
            return nums[start];
        }
        int mid = (start + end) / 2;
        long gcdFront = gcds(start, mid);
        long gcdEnd = gcds(mid, end);
        return Long.max(gcdFront + recursion(mid, end), recursion(start, mid) + gcdEnd);
    }

    private static long gcds(int start, int end) {
        long gcd = nums[start];

        for (int i = start; i <= end; i++) {
            gcd = gcd(gcd, nums[i]);
        }

        return gcd;
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}