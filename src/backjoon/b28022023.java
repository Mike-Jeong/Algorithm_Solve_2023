package backjoon;

import java.io.*;
import java.util.*;

//수들의 합
//28022023

public class b28022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Long n = Long.parseLong(st.nextToken());

        long sum = 0;
        int count = 0;

        while (sum < n) {
            sum += count;
            count++;
        }

        System.out.println(sum == n ? count - 1 : count - 2);
    }

}
