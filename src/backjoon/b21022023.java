package backjoon;

import java.io.*;
import java.util.*;

//행성 연결
//21022023

public class b21022023 {

    static int[] parents;
    static List<int[]> edges;
    static int n;
    static long ans = 0;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        edges = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 1; i <= n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {

                int w = Integer.parseInt(st.nextToken());

                if (i < j) {
                    edges.add(new int[] { i, j, w });
                }
            }
        }

        Collections.sort(edges, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }

        });

        solve();
        System.out.println(ans);

    }

    static void solve() {
        for (int i = 0; i < edges.size(); i++) {

            int[] current = edges.get(i);

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