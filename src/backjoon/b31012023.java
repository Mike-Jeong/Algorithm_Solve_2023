package backjoon;

import java.io.*;
import java.util.*;

//사회망 서비스(SNS)
//31012023

public class b31012023 {

    static Map<Integer, ArrayList<Integer>> map;
    static int[][] dp;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        map = new HashMap<>();
        dp = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            map.get(s).add(e);
            map.get(e).add(s);
        }

        recursion(1, -1);

        System.out.println(Math.min(dp[1][0], dp[1][1]));
    }

    private static void recursion(int node, int p) {
		dp[node][0] = 0;
		dp[node][1] = 1;

		for (int next : map.get(node)) {
			if (next != p) {
				recursion(next, node);
				dp[node][0] += dp[next][1];
				dp[node][1] += Math.min(dp[next][0], dp[next][1]);
			}
		}
	}
}
