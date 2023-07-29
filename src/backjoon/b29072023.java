package backjoon;

import java.io.*;
import java.util.*;

//페이지 세기
//29072023

public class b29072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) {
                System.out.println(sb);
                return;
            }

            boolean[] check = new boolean[n + 1];

            String s = br.readLine();

            String[] nums = s.split(",");

            for (String string : nums) {
                String[] range = string.split("-");

                int low = Integer.parseInt(range[0]);

                if (low > n) {
                    continue;
                }

                if (range.length == 1) {
                    check[low] = true;
                    continue;
                }

                int high = Integer.parseInt(range[1]);

                for (int i = low; i <= Math.min(high, n); i++) {
                    check[i] = true;
                }
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (check[i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");

        }
    }
}
