package backjoon;

import java.io.*;
import java.util.*;

//다리 만들기 2
//04012023

public class b04012023 {

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int[] rowOrder = new int[] { -1, 0, 1, 0 };
    static int[] colOrder = new int[] { 0, -1, 0, 1 };

    static int[] parents;
    static Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[2] - o2[2];
        }

    });

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        parents = new int[findIsland()];
        initParents();

        searchRoute();

        int ans = solve();

        for (int i = 1; i < parents.length - 1; i++) {
            if (find(parents[i]) != find(parents[i + 1])) {
                ans = 0;
                break;
            }
        }

        System.out.println(ans == 0 ? -1 : ans);

    }

    static int findIsland() {

        int numIsland = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    markIsland(numIsland, i, j);
                    numIsland++;
                }
            }
        }

        return numIsland;

    }

    static void markIsland(int islandNum, int row, int col) {

        if (!visited[row][col]) {

            visited[row][col] = true;
            map[row][col] = islandNum;

            for (int i = 0; i < 4; i++) {
                try {
                    if (map[row + rowOrder[i]][col + colOrder[i]] != 0
                            && !visited[row + rowOrder[i]][col + colOrder[i]]) {
                        markIsland(islandNum, row + rowOrder[i], col + colOrder[i]);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

    }

    static void initParents() {
        for (int i = 1; i < parents.length; i++) {
            parents[i] = i;
        }
    }

    static void searchRoute() {
        for (int i = 0; i < n; i++) {

            int island = -1;
            int position = -1;

            for (int j = 0; j < m; j++) {
                if (map[i][j] != 0) {

                    if (island == -1) {
                        island = map[i][j];
                        position = j;
                        continue;
                    }

                    if (map[i][j] == island) {
                        position = j;
                        continue;
                    }

                    if (map[i][j] != island) {

                        if (j - position - 1 > 1) {
                            queue.add(new int[] { island, map[i][j], j - position - 1 });
                        }

                        island = map[i][j];
                        position = j;
                    }

                }
            }
        }

        for (int i = 0; i < m; i++) {

            int island = -1;
            int position = -1;

            for (int j = 0; j < n; j++) {
                if (map[j][i] != 0) {

                    if (island == -1) {
                        island = map[j][i];
                        position = j;
                        continue;
                    }

                    if (map[j][i] == island) {
                        position = j;
                        continue;
                    }

                    if (map[j][i] != island) {

                        if (j - position - 1 > 1) {
                            queue.add(new int[] { island, map[j][i], j - position - 1 });
                        }

                        island = map[j][i];
                        position = j;
                    }

                }
            }
        }

    }

    static int solve() {

        int ans = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (find(current[0]) != find(current[1])) {
                // System.out.println(current[0] + " " + current[1] + " " + current[2]);
                ans += current[2];
                union(current[0], current[1]);
            }
        }

        return ans;
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

}