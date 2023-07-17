package backjoon;

import java.io.*;
import java.util.*;

//짐 챙기는 숌
//17072023

public class b17072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] boxes = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += boxes[i];

            if (sum > m) {
                count++;
                sum = boxes[i];
            }
        }

        System.out.println(count + 1);
    }
}
