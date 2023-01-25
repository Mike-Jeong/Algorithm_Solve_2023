package backjoon;

import java.io.*;
import java.util.*;

//플로이드 2
//25012023

public class b25012023 {

    static final int MAX = 987654321;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[][] map = new int[n + 1][n + 1];
        int[][] route = new int[n + 1][n + 1];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = MAX;
                route[i][j] = MAX;
            }
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            map[s][e] = Math.min(map[s][e], c);
            route[s][e] = s;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {

                    if (i == j) {
                        continue;
                    }

                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                        route[i][j] = route[k][j];
                    }

                }
            }
        }

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                sb.append(map[i][j] == MAX ? 0 : map[i][j]).append(" ");
            }
            sb.append("\n");
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (route[i][j] == MAX) {
                    sb.append(0).append("\n");
                    continue;
                }

                int pre = j;
                stack.push(j);
                while (i != route[i][pre]) {
                    pre = route[i][pre];
                    stack.push(pre);
                }

                sb.append(stack.size() + 1)
                        .append(" ")
                        .append(i)
                        .append(" ");

                while (!stack.isEmpty()) {
                    sb.append(stack.pop())
                            .append(" ");
                }

                sb.append("\n");

            }
        }

        System.out.println(sb);

    }
}
