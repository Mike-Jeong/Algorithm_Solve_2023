package backjoon;

import java.io.*;
import java.util.*;

//
//13062023

public class b13062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String doorNumber = st.nextToken();

        int[] card = new int[9];

        for (int i = 0; i < doorNumber.length(); i++) {

            if (doorNumber.charAt(i) == '6' || doorNumber.charAt(i) == '9') {

                card[6]++;

                continue;
            }

            card[(int) doorNumber.charAt(i) - 48]++;
        }

        int ans = 0;
        for (int i = 0; i < 9; i++) {

            if (i == 6) {

                int count = card[i] / 2 + (card[i] % 2);
                ans = Math.max(ans, count);

                continue;
            }

            ans = Math.max(ans, card[i]);
        }

        System.out.println(ans);

    }

}
