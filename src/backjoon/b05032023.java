package backjoon;

import java.io.*;
import java.util.*;

//에라토스테네스의 체
//05032023

public class b05032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean check[] = new boolean[1000 + 1];

        check[0] = true;
        check[1] = true;

        int count = 0;
        int ans = -1;

        loop: for (int i = 2; i <= n; i++) {

            if (!check[i]) {
                for (int j = 1; (j * i) <= n; j++) {

                    if (!check[i * j]) {

                        if (j != 1) {
                            check[i * j] = true;
                        }

                        count++;

                        if (count == k) {
                            ans = i * j;
                            break loop;
                        }
                    }

                }
            }
        }

        System.out.println(ans);
    }
}
