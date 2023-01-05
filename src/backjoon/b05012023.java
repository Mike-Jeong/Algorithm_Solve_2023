package backjoon;

import java.io.*;
import java.util.*;

//게임 개발
//05012023

public class b05012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] buildPrice = new int[n + 1];
        int[] buildCount = new int[n + 1];
        int[] prices = new int[n + 1];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        list.add(null);

        for (int i = 1; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {

            st = new StringTokenizer(br.readLine());
            buildPrice[i] = Integer.parseInt(st.nextToken());

            while (true) {

                int build = Integer.parseInt(st.nextToken());

                if (build == -1) {
                    break;
                }

                list.get(build).add(i);

                buildCount[i]++;

            }

            if (buildCount[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {

            int current = queue.poll();
            List<Integer> neighbor = list.get(current);

            for (int i = 0; i < neighbor.size(); i++) {
                buildCount[neighbor.get(i)]--;
                prices[neighbor.get(i)] = Math.max(prices[neighbor.get(i)], buildPrice[current] + prices[current]);

                if (buildCount[neighbor.get(i)] == 0) {
                    queue.add(neighbor.get(i));
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(prices[i] + buildPrice[i]);
        }

    }

}