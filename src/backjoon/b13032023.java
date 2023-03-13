package backjoon;

import java.io.*;
import java.util.*;

//문자열 집합
//13032023

public class b13032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> map = new HashSet<>();

        for (int i = 0; i < n; i++) {
            map.add(br.readLine());
        }

        int ans = 0;

        for (int i = 0; i < m; i++) {
            if (map.contains(br.readLine())) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
