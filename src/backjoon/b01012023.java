package backjoon;

import java.io.*;
import java.util.*;

//동전 분배
//01012023

public class b01012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < 3; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            boolean[][] check = new boolean[n + 1][100001];

            int maxValue = 0;
            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());

                int amount = Integer.parseInt(st.nextToken());
                int quantity = Integer.parseInt(st.nextToken());

                for (int j = 1; j <= quantity; j++) {

                    check[i][amount * j] = true;
                    for (int k = 0; k <= maxValue; k++) {
                        if (check[i - 1][k]) {
                            check[i][k] = true;
                            check[i][k + (amount * j)] = true;
                        }
                    }
                }

                maxValue += (amount * quantity);
            }

            if (maxValue % 2 == 1) {
                sb.append(0).append("\n");
            } else {

                boolean ck = false;

                int halfMaxValue = maxValue / 2;
                for (int i = 0; i <= halfMaxValue / 2; i++) {

                    if (check[n][i] && check[n][halfMaxValue - i]) {
                        ck = true;
                        break;
                    }
                }

                sb.append(ck ? 1 : 0).append("\n");

            }
        }

        System.out.println(sb.toString());
    }
}
