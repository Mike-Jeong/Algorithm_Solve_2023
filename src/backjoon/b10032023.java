package backjoon;

import java.io.*;
import java.util.*;

//나는야 포켓몬 마스터 이다솜
//10032023

public class b10032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String[] names = new String[n + 1];

        for (int i = 1; i < n + 1; i++) {
            String name = br.readLine();
            map.put(name, i);
            names[i] = name;
        }

        for (int i = 0; i < m; i++) {

            String target = br.readLine();
            if (isStringNumber(target)) {
                int index = Integer.parseInt(target);
                sb.append(names[index]);
            } else {
                sb.append(map.get(target));
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean isStringNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
