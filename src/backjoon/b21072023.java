package backjoon;

import java.io.*;
import java.util.*;

//장신구 명장 임스
//21072023

public class b21072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int p = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] items = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(items);

        int count = 0;
        int i = 0;
        while (p < 200) {

            if (i == n) {
                break;
            }
            
            p += items[i];
            count++;
            i++;
        }

        System.out.println(count);

    }
}
