package backjoon;

import java.io.*;
import java.util.*;

//CD
//09032023

public class b09032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                set.add(Integer.parseInt(st.nextToken()));
            }

            int count = 0;
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
