package backjoon;

import java.io.*;
import java.util.*;

//학생번호
//08062023

public class b08062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        String[] students = new String[n];

        for (int i = 0; i < n; i++) {
            students[i] = br.readLine();
        }

        for (int i = students[0].length() - 1; i >= 0; i--) {

            Set<String> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                set.add(students[j].substring(i, students[0].length()));
            }

            if (set.size() == n) {
                System.out.println(students[0].length() - i);
                break;
            }

        }

    }

}
