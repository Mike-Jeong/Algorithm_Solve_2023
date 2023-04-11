package backjoon;

import java.io.*;
import java.util.*;

//민균이의 계략
//11042023

public class b11042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(0);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            if (num > list.get(list.size() - 1)) {
                list.add(num);
            } else {
                int left = 1;
                int right = list.size() - 1;

                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= num) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right, num);
            }
        }

        System.out.println(list.size() - 1);

    }
}
