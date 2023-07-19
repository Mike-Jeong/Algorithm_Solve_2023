package backjoon;

import java.io.*;
import java.util.*;

//최대 상승
//19072023

public class b19072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int gap = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (min > current) {
                min = current;
                continue;
            }

            gap = Math.max(gap, current - min);
        }

        System.out.println(gap);

    }
}
