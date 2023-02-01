package backjoon;

import java.io.*;
import java.util.*;

//사회망 서비스(SNS)
//01022023

public class b01022023 {

    static Map<Integer, ArrayList<Integer>> map;
    static int[] colours;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {

            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            map = new HashMap<>();
            colours = new int[v + 1];

            Arrays.fill(colours, -1);

            for (int j = 1; j <= v; j++) {
                map.put(j, new ArrayList<>());
            }

            for (int j = 0; j < e; j++) {

                st = new StringTokenizer(br.readLine());

                int sv = Integer.parseInt(st.nextToken());
                int ev = Integer.parseInt(st.nextToken());

                map.get(sv).add(ev);
                map.get(ev).add(sv);
            }

            boolean ck = true;

            for (int j = 1; j <= v; j++) {
                if (colours[j] == -1) {
                    if (!recursion(j, 0)) {
                        ck = false;
                        break;
                    }
                }
            }

            System.out.println(ck ? "YES" : "NO");

        }

    }

    private static boolean recursion(int node, int colour) {

        colours[node] = colour;

        List<Integer> list = map.get(node);


        boolean ck = true;

        for (int i = 0; i < list.size(); i++) {

            if (colours[list.get(i)] == colour) {
                return false;
            }

            if (colours[list.get(i)] == -1) {
                if (!recursion(list.get(i), (colour + 1) % 2)) {
                  ck = false;
                  break;  
                } 
            }

        }

        return ck;
    }
}
