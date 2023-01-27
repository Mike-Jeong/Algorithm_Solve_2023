package backjoon;

import java.io.*;
import java.util.*;

//선수과목 (Prerequisite)
//27012023

public class b27012023 {

    static Map<Integer, List<Integer>> map = new HashMap<>();
    static int[] count;
    static int[] semester;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        count = new int[n + 1];
        semester = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            map.get(s).add(e);

            count[e]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            List<Integer> list = map.get(cur);

            for (int i = 0; i < list.size(); i++) {

                count[list.get(i)]--;
                semester[list.get(i)] = Math.max(semester[list.get(i)], semester[cur] + 1);

                if (count[list.get(i)] == 0) {
                    queue.add(list.get(i));
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print((semester[i] + 1) + " ");
        }

    }
}
