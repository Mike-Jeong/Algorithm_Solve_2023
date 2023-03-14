package backjoon;

import java.io.*;
import java.util.*;

//동일한 단어 그룹화하기
//14032023

public class b14032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            str = str.chars()
                    .sorted()
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();

            set.add(str);
        }

        System.out.println(set.size());
    }
}
