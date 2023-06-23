package backjoon;

import java.io.*;
import java.util.*;

//빈도 정렬
//23062023

public class b23062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            if (!map.containsKey(num)) {
                map.put(num, 1);
                indexMap.put(num, i);
                continue;
            }

            map.replace(num, map.get(num) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (o1, o2) -> {

            if (map.get(o1) == map.get(o2)) {

                return indexMap.get(o1) - indexMap.get(o2);
            }

            return map.get(o2) - map.get(o1);
        }

        );

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < map.get(list.get(i)); j++) {

                sb.append(list.get(i)).append(" ");

            }
        }

        System.out.println(sb);

    }
}
