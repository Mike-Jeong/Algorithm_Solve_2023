package backjoon;

import java.io.*;
import java.util.*;

//국회의원 선거
//29042023

public class b29042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        while (true) {

            if (queue.isEmpty() || target > queue.peek()) {
                break;
            }

            count++;
            target++;
            queue.add(queue.poll() - 1);
        }

        System.out.println(count);

    }
}
