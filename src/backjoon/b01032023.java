package backjoon;

import java.io.*;
import java.util.*;

//트리의 부모 찾기
//01032023

public class b01032023 {

    static Map<Integer, List<Integer>> edges = new HashMap<>();
    static boolean[] visited;
    static int[] parents;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            edges.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            edges.get(s).add(e);
            edges.get(e).add(s);

        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 1 });

        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            parents[current[1]] = current[0];
            visited[current[1]] = true;

            List<Integer> list = edges.get(current[1]);

            for (int i = 0; i < list.size(); i++) {
                if (!visited[list.get(i)]) {
                    queue.add(new int[] { current[1], list.get(i) });
                }
            }

        }

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }

}
