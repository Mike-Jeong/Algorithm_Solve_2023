package backjoon;

import java.io.*;
import java.util.*;

//작업
//13022023

public class b13022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] counts = new int[n + 1];
        int[] times = new int[n + 1];
        int[] dp = new int[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());

            st = new StringTokenizer(br.readLine());

            times[i] = Integer.parseInt(st.nextToken());

            int num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                queue.add(i);
                continue;
            }

            for (int j = 0; j < num; j++) {
                int index = Integer.parseInt(st.nextToken());
                map.get(index).add(i);
                counts[i]++;
            }
        }

        while (!queue.isEmpty()) {

            int current = queue.poll();

            List<Integer> list = map.get(current);

            for (int i = 0; i < list.size(); i++) {
                int next = list.get(i);

                counts[next]--;

                if (counts[next] == 0) {
                    queue.add(next);
                }

                dp[next] = Math.max(dp[next], dp[current] + times[current]);
            }
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dp[i] + times[i]);
        }

        System.out.println(max);

    }
}