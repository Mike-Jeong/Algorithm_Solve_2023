package backjoon;

import java.io.*;
import java.util.*;

//서로 다른 부분 문자열의 개수
//01052023

public class b01052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }

        System.out.println(set.size());

    }
}
