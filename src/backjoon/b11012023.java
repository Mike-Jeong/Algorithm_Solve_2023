package backjoon;

import java.io.*;
import java.util.*;

//타이머신
//11012023

public class b11012023 {

    static ArrayList<int[]> edges = new ArrayList<>();
    static long[] dp;

    private static final long INF = Long.MAX_VALUE;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        dp = new long[n + 1];
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges.add(new int[] { s, e, c });
        }

        solution(1);

    }

    // 벨만-포드 알고리즘
    private static void solution(int start) {

        Arrays.fill(dp, INF);

        dp[start] = 0;

        // 정점의 갯수만큼(V)
        for (int i = 1; i < dp.length; i++) {
            // 간선의 갯수만큼 반복 (E) -> O(VE)
            for (int j = 0; j < edges.size(); j++) {
                int[] current = edges.get(j);

                if (dp[current[0]] != INF && dp[current[1]] > dp[current[0]] + current[2]) {
                    dp[current[1]] = dp[current[0]] + current[2];
                }
            }
        }

        // 음수 가중치 확인 절차
        for (int i = 0; i < edges.size(); i++) {
            int[] current = edges.get(i);

            if (dp[current[0]] != INF && dp[current[1]] > dp[current[0]] + current[2]) {

                System.out.println(-1);

                return;
            }
        }

        for (int i = 2; i < dp.length; i++) {
            System.out.println(dp[i] == INF ? -1 : dp[i]);
        }

    }
}

// https://velog.io/@kimdukbae/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B2%A8%EB%A7%8C-%ED%8F%AC%EB%93%9C-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Bellman-Ford-Algorithm
// https://velog.io/@suk13574/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98Java-%EB%B2%A8%EB%A7%8C-%ED%8F%AC%EB%93%9CBellman-Ford-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
// 알고리즘 정리