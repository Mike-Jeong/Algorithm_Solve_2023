package backjoon;

import java.io.*;
import java.util.*;

//어두운 굴다리
//11032023

public class b11032023 {

    static int n;
    static int[] positions;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        positions = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = n;

        while (left < right) {
            int mid = (left + right) / 2;

            int  index = 0;

            for (int i = 0; i < m; i++) {

                int s = positions[i] - mid;
                int e = positions[i] + mid;

                if (index < s) {
                    break;
                } else {
                    index = e;
                }
            }

            if (n <= index) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}
