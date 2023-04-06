package backjoon;

import java.io.*;
import java.util.*;

//해킹
//06042023

public class b06042023 {

    private static final int MAX = 987654321;

    static int n;
    static int[] dp;
    static Map<Integer, ArrayList<int[]>> route;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dp = new int[n + 1];
            route = new HashMap<>();

            for (int i = 0; i <= n; i++) {
                dp[i] = MAX;
                route.put(i, new ArrayList<>());
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());

                int e = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                route.get(s).add(new int[] { e, w });

            }

            dp[c] = 0;
            solve(c, sb);

        }

        System.out.println(sb);

    }

    private static void solve(int start, StringBuilder sb) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            List<int[]> list = route.get(current);

            for (int i = 0; i < list.size(); i++) {
                int[] next = list.get(i);

                if (dp[next[0]] > dp[current] + next[1]) {
                    dp[next[0]] = dp[current] + next[1];
                    queue.add(next[0]);
                }
            }

        }

        int ans = 0;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i != start && dp[i] != MAX) {
                count++;
                ans = Math.max(ans, dp[i]);
            }
        }

        sb.append(count).append(" ").append(ans).append("\n");
    }

}
