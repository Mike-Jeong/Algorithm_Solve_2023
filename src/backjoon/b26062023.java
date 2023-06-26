package backjoon;

import java.io.*;
import java.util.*;

//덩치
//26062023

public class b26062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int[][] people = new int[n][2];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    count++;
                }

            }

            sb.append(count + 1).append(" ");

        }

        System.out.println(sb);

    }
}
