package backjoon;

import java.io.*;
import java.util.*;

//웜홀
//12012023

public class b12012023 {

    static ArrayList<int[]>[] edges;
    static long[] dp;

    private static final long INF = Long.MAX_VALUE;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());

        for (int z = 0; z < tc; z++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edges = new ArrayList[n + 1];
            dp = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());

                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                edges[s].add(new int[] { e, t });
                edges[e].add(new int[] { s, t });
            }

            for (int i = 0; i < w; i++) {
                st = new StringTokenizer(br.readLine());

                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                edges[s].add(new int[] { e, -t });
            }

            solution(1);
        }

    }

    // 벨만-포드 알고리즘
    private static void solution(int start) {

        boolean isUpdate = false;

        Arrays.fill(dp, INF);

        dp[start] = 0;

        // 정점의 갯수만큼(V)
        for (int i = 1; i < dp.length; i++) {

            isUpdate = false;

            for (int j = 1; j < dp.length; j++) {
                for (int[] ed : edges[j]) {
                    if (dp[j] != INF && dp[ed[0]] > dp[j] + ed[1]) {
                        dp[ed[0]] = dp[j] + ed[1];
                        isUpdate = true;
                    }
                }
            }

            if (!isUpdate) {
                break;
            }
        }

        System.out.println(isUpdate ? "YES" : "NO");

    }
}