package backjoon;

import java.io.*;
import java.util.*;

//
//09042023

public class b09042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] count = new int[n + 1];
        int[] bulidcount = new int[n + 1];
        Map<Integer, List<Integer>> listMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            listMap.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            listMap.get(s).add(e);

            count[e]++;
        }

        boolean fair = true;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            if (c == 1) {

                if (count[target] > 0) {
                    fair = false;
                    break;
                }

                bulidcount[target]++;

                if (bulidcount[target] == 1) {

                    List<Integer> list = listMap.get(target);

                    for (Integer integer : list) {
                        count[integer]--;
                    }
                }

            } else if (c == 2) {
                if (bulidcount[target] <= 0) {
                    fair = false;
                    break;
                }

                bulidcount[target]--;

                if (bulidcount[target] == 0) {

                    List<Integer> list = listMap.get(target);

                    for (Integer integer : list) {
                        count[integer]++;
                    }
                }
            }
        }

        System.out.println(fair ? "King-God-Emperor" : "Lier!");

    }
}
