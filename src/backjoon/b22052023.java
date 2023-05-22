package backjoon;

import java.io.*;
import java.util.*;

//알고리즘 수업 - 깊이 우선 탐색 2
//21052023

public class b22052023 {

    private static int[] order;
    private static boolean[] visited;
    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static int count = 1;
    private static int n;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        order = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            map.get(u).add(v);
            map.get(v).add(u);
        }

        recursion(r);

        for (int i = 1; i <= n; i++) {
            sb.append(order[i]).append("\n");
        }

        System.out.println(sb);

    }

    private static void recursion(int current) {

        visited[current] = true;
        order[current] = count;
        count++;

        List<Integer> list = map.get(current);

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            if (!visited[list.get(i)]) {
                recursion(list.get(i));
            }
        }

    }
}
