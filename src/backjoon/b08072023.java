package backjoon;

import java.io.*;
import java.util.*;

//카우버거
//08072023

public class b08072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numSets = Math.min(b, Math.min(c, d));

        int[] burgers = new int[b];
        int[] sides = new int[c];
        int[] drinks = new int[d];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            burgers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < d; i++) {
            drinks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(burgers);
        Arrays.sort(sides);
        Arrays.sort(drinks);

        int total = 0;
        int discountTotal = 0;

        for (int i = 0; i < b; i++) {
            total += burgers[b - i - 1];
            discountTotal += burgers[b - i - 1];

            if (i < numSets) {
                discountTotal -= burgers[b - i - 1] / 10;
            }
        }

        for (int i = 0; i < c; i++) {
            total += sides[c - i - 1];
            discountTotal += sides[c - i - 1];

            if (i < numSets) {
                discountTotal -= sides[c - i - 1] / 10;
            }
        }

        for (int i = 0; i < d; i++) {
            total += drinks[d - i - 1];
            discountTotal += drinks[d - i - 1];

            if (i < numSets) {
                discountTotal -= drinks[d - i - 1] / 10;
            }
        }

        System.out.println(total);
        System.out.println(discountTotal);

    }

}
