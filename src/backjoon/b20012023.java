package backjoon;

import java.io.*;
import java.util.*;

//음악프로그램
//20012023

public class b20012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] count = new int[n + 1];
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int numArtist = Integer.parseInt(st.nextToken());

            int prev = Integer.parseInt(st.nextToken());
            for (int j = 1; j < numArtist; j++) {
                int now = Integer.parseInt(st.nextToken());

                if (!map.containsKey(prev)) {
                    map.put(prev, new ArrayList<>());
                }

                map.get(prev).add(now);

                count[now]++;

                prev = now;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                queue.add(i);
            }
        }

        Queue<Integer> ans = new LinkedList<>();

        while (!queue.isEmpty()) {

            int now = queue.poll();
            ans.add(now);

            if (map.containsKey(now)) {
                List<Integer> list = map.get(now);

                for (Integer integer : list) {
                    count[integer]--;

                    if (count[integer] == 0) {
                        queue.add(integer);
                    }
                }
            }

        }

        boolean ck = true;
        for (int i = 1; i <= n; i++) {
            if (count[i] != 0) {
                System.out.println(0);
                ck = false;
            }
        }

        if (ck) {
            while (!ans.isEmpty()) {
                System.out.println(ans.poll());
            }
        }

    }
}
