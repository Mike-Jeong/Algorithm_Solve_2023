package backjoon;

import java.io.*;
import java.util.*;

//나만 안되는 연애
//05042023

public class b05042023 {

    static int n;
    static int[] parents;
    static boolean[] sCheck;
    static Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[2] - o2[2];
        }

    });

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        sCheck = new boolean[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
            sCheck[i] = st.nextToken().charAt(0) == 'M' ? true : false;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            queue.add(new int[] { Math.min(u, v), Math.max(u, v), d });

        }

        System.out.println(solve());

    }

    private static int solve() {

        int ans = 0;
        int count = 0;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            if (sCheck[current[0]] != sCheck[current[1]] && find(current[0]) != find(current[1])) {

                ans += current[2];
                count++;

                union(current[0], current[1]);

            }

        }

        return count == n - 1 ? ans : -1;
    }

    private static int find(int n) {

        if (parents[n] == n) {
            return n;
        }

        return parents[n] = find(parents[n]);

    }

    private static void union(int a, int b) {

        a = find(a);
        b = find(b);

        if (a != b) {
            parents[b] = a;
        }

    }

}
