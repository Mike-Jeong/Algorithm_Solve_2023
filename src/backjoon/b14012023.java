package backjoon;

import java.io.*;
import java.util.*;

//헤븐스 키친
//14012023

public class b14012023 {

    static int[] parents;
    static Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

        @Override
        public int compare(int[] o1, int[] o2) {
            return o2[2] - o1[2];
        }

    });

    static boolean[] visited;
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static int ans = 0;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        visited = new boolean[n + 1];
        int[][] chefs = new int[n + 1][2];

        for (int i = 1; i < parents.length; i++) {
            parents[i] = i;
            map.put(i, new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            chefs[i][0] = Integer.parseInt(st.nextToken());
            chefs[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < chefs.length - 1; i++) {
            for (int j = i + 1; j < chefs.length; j++) {

                int viewerRatings = (chefs[i][1] + chefs[j][1]) / Math.abs(chefs[i][0] - chefs[j][0]);

                queue.add(new int[] { i, j, viewerRatings });
            }
        }

        solve();
        System.out.println(ans);
        recursion(1);
    }

    static void solve() {

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (find(current[0]) != find(current[1])) {
                ans += current[2];
                map.get(current[0]).add(current[1]);
                map.get(current[1]).add(current[0]);
                union(current[0], current[1]);
            }
        }
    }

    static void union(int x, int y) {

        x = find(x);
        y = find(y);

        if (x < y) {
            parents[y] = x;
        } else {
            parents[x] = y;
        }
    }

    static int find(int x) {

        if (x == parents[x]) {
            return x;
        }

        return parents[x] = find(parents[x]);
    }

    static void recursion(int n) {

        visited[n] = true;

        List<Integer> list = map.get(n);

        for (int next : list) {
            if (visited[next]) {
                continue;
            }
            recursion(next);
            System.out.println(n + " " + next);

        }

    }
}