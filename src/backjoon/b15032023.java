package backjoon;

import java.io.*;
import java.util.*;

//배부른 마라토너
//15032023

public class b15032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String key = br.readLine();

            if (map.get(key) == null) {

                map.put(key, 1);

            } else {

                map.put(key, map.get(key) + 1);

            }
        }

        for (int i = 0; i < n - 1; i++) {

            String key = br.readLine();

            map.put(key, map.get(key) - 1);

        }

        for (String key : map.keySet()) {

            if (map.get(key) != 0) {

                System.out.println(key);

                break;
            }
        }
    }
}
