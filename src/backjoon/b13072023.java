package backjoon;

import java.io.*;
import java.util.*;

//귀걸이
//13072023

public class b13072023 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) {
                System.out.println(sb);
                return;
            }

            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = br.readLine();
            }

            int sum = (n * (n + 1));
            for (int i = 0; i < (2 * n) - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int idx = Integer.parseInt(st.nextToken());
                sum -= idx;
            }

            sb.append(count).append(" ").append(names[sum - 1]).append("\n");
            count++;

        }
    }

}
