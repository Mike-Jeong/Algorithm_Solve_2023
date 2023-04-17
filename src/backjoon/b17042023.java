package backjoon;

import java.io.*;
import java.util.*;

//주식
//17042023

public class b17042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            List<Integer> list = new ArrayList<>();
            Set<Integer> check = new HashSet<>();

            list.add(Integer.parseInt(st.nextToken()));
            check.add(1);

            for (int i = 1; i < n; i++) {

                int p = Integer.parseInt(st.nextToken());

                if (list.get(list.size() - 1) < p) {
                    list.add(p);
                    check.add(list.size());
                } else {
                    int left = 0;
                    int right = list.size() - 1;

                    while (left < right) {

                        int mid = (left + right) / 2;

                        if (list.get(mid) >= p) {
                            right = mid;
                        } else {
                            left = mid + 1;
                        }
                    }
                    check.add(right + 1);
                    list.set(right, p);
                }
            }

            sb.append(String.format("Case #%d", t)).append("\n");
            sb.append(check.contains(k) ? 1 : 0).append("\n");

        }

        System.out.println(sb);
    }
}
