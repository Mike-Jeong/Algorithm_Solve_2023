package backjoon;

import java.io.*;
import java.util.*;

//오늘도 졌다
//28062023

public class b28062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int[] scores = new int[9];

        for (int i = 0; i < 9; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int w = 0;
        int s = 0;

        boolean moreScore = false;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            w += scores[i];

            if (w > s) {
                moreScore = true;
                break;
            }

            s += Integer.parseInt(st.nextToken());
        }

        System.out.println(moreScore ? "Yes" : "No");

    }
}
