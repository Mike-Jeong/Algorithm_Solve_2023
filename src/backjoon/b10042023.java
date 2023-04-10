package backjoon;

import java.io.*;
import java.util.*;

//회전하는 큐
//10042023

public class b10042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            int initSize = list.size();
            int count = 0;

            while (target != list.peekFirst()) {
                count++;
                list.add(list.pollFirst());
            }

            list.pollFirst();

            ans += Math.min(count, initSize - count);

        }

        System.out.println(ans);

    }
}
