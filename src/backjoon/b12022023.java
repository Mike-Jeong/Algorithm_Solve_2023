package backjoon;

import java.io.*;
import java.util.*;

//회의준비
//12022023

public class b12022023 {

    static int n;
    static int[][] map;
    static boolean[] visited;
    static final int INF = 987654321;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    map[i][j] = INF;
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        visited = new boolean[n + 1];

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                list.add(solve(i));
            }
        }

        sb.append(list.size() + "\n");

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + "\n");
        }

        System.out.println(sb);
    }

    private static int solve(int start) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        visited[start] = true;

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(start);

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int i = 1; i <= n; i++) {
                if (map[now][i] != INF && !visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                    arrList.add(i);
                }
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int idx = -1;
        int res = INF;

        for (int i = 1; i <= n; i++) {
            if (!arrList.contains(i)) {
                continue;
            }

            int total = 0;
            for (int j = 1; j <= n; j++) {
                if (!arrList.contains(j)) {
                    continue;
                }

                total = Math.max(total, map[i][j]);
            }

            if (res > total) {
                res = total;
                idx = i;
            }
        }

        return idx;
    }
}