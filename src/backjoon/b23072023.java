package backjoon;

import java.io.*;
import java.util.*;

//출입 기록
//23072023

public class b23072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        boolean[] people = new boolean[200001];

        int count = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (b == 1) {
                if (people[a]) {
                    count++;
                }
                people[a] = true;
            }

            if (b == 0) {
                if (!people[a]) {
                    count++;
                }
                people[a] = false;
            }

        }

        for (int i = 1; i <= 200000; i++) {
            if (people[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
