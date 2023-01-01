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

/*
 public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < 3; t++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            ArrayList<coin> coins = new ArrayList<>();
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int value = Integer.parseInt(st.nextToken());
                int amount = Integer.parseInt(st.nextToken());
                coins.add(new coin(value, amount));
                sum += value * amount;
            }
            if (sum % 2 == 1) {
                sb.append("0\n");
                continue;
            }
            sum /= 2;
            boolean[] dp = new boolean[sum + 1];
            dp[0] = true;
            for (coin c : coins) {
                int value = c.value;
                int amount = c.amount;
                for (int i = sum - value; i >= 0; i--) {
                    if (!dp[i]) continue;
                    for (int j = 1; j <= amount; j++) {
                        if (i + j * value > sum) break;
                        dp[i + j * value] = true;
                    }
                    if (dp[sum]) break;
                }
            }
            sb.append(dp[sum] ? "1\n" : "0\n");
        }
        System.out.println(sb);
    }
}

class coin {
    int value;
    int amount;

    public coin(int value, int amount) {
        this.value = value;
        this.amount = amount;
    }
}
*/ 
// 더 나은 코드 
