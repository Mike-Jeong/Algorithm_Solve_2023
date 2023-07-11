package backjoon;

import java.io.*;
import java.util.*;

//백대열
//11072023

public class b11072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();
        String[] nums = s.split(":");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        int gcd = gcd(Math.max(a, b), Math.min(a, b));

        System.out.println((a / gcd) + ":" + (b / gcd));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
