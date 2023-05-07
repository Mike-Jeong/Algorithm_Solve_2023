package backjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//영단어 암기는 괴로워
//07052023

public class b07052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if (s.length() < m) {
                continue;
            }

            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = map.keySet().stream().sorted((s1, s2) -> {
            int c1 = map.get(s1);
            int c2 = map.get(s2);

            if (c1 == c2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s2.length() - s1.length();
            }
            return c2 - c1;
        }).collect(Collectors.toList());

        list.forEach(s -> sb.append(s).append("\n"));

        System.out.println(sb);

    }
}
