package backjoon;

import java.io.*;
import java.util.*;

//도시 건설
//20022023

public class b20022023 {

    static int[] parents;
    static int[][] edges;
    static int n;
    static int m;
    static long allSum = 0;
    static long ans = 0;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        edges = new int[m][3];

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(edges, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }

        });

        solve();

        boolean ck = true;
        int p = find(1);
        for (int i = 2; i <= n; i++) {
            if (find(i) != p) {
                ck = false;
                break;
            }
        }

        System.out.println(ck ? (allSum - ans) : -1);

    }

    static void solve() {
        for (int i = 0; i < m; i++) {

            int[] current = edges[i];

            allSum += current[2];

            if (find(current[0]) != find(current[1])) {
                // System.out.println(current[0] + " " + current[1] + " " + current[2]);
                ans += current[2];
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
        if (parents[x] == x) {
            return x;
        } else {
            return find(parents[x]);
        }
    }
}