package backjoon;

import java.io.*;
import java.util.*;

//꿀벌
//12032023

public class b12032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] str = { "Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex" };

        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, 0);
        }
        double total = 0;
        String s = "";

        while ((s = br.readLine()) != null) {
            String[] works = s.split(" ");
            total += works.length;
            for (int i = 0; i < works.length; i++) {
                if (map.containsKey(works[i])) {
                    map.put(works[i], map.get(works[i]) + 1);
                }
            }

        }

        for (int i = 0; i < 7; i++) {
            sb.append(String.format("%s %d %.2f\n", str[i], map.get(str[i]), map.get(str[i]) / total));
        }

        sb.append(String.format("%s %d %.2f\n", "Total", (int) total, 1.00));

        System.out.println(sb);
    }
}
