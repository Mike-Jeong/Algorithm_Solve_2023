package backjoon;

import java.io.*;
import java.util.*;

//3의 배수
//09072023

public class b09072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String num = st.nextToken();

        if (num.length() == 1) {
            int n = Integer.parseInt(num);

            System.out.println(0);
            System.out.println(n % 3 == 0 ? "YES" : "NO");

            return;
        }

        int n = 0;

        for (int i = 0; i < num.length(); i++) {
            n += (num.charAt(i) - 48);
        }

        int count = 1;
        while (n > 9) {
            int sum = 0;
            count++;
            while (n > 0) {
                sum += (n % 10);
                n /= 10;
            }

            n = sum;
        }

        System.out.println(count);
        System.out.println(n % 3 == 0 ? "YES" : "NO");
    }

}
