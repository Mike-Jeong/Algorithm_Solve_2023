package backjoon;

import java.io.*;
import java.util.*;

//큐 2
//07012023

public class b07012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        LinkedList<Integer> queue = new LinkedList<>();

        Map<String, Command> map = new HashMap<>();

        map.put("push", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {

                int n = Integer.parseInt(st.nextToken());
                queue.add(n);
                return -2;
            }

        });
        map.put("pop", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {
                if (queue.isEmpty()) {
                    return -1;
                }

                return queue.pollFirst();
            }

        });
        map.put("size", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {

                return queue.size();
            }

        });
        map.put("empty", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {

                return queue.isEmpty() ? 1 : 0;
            }

        });
        map.put("front", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {
                if (queue.isEmpty()) {
                    return -1;
                }

                return queue.peekFirst();
            }

        });
        map.put("back", new Command() {

            @Override
            public int process(LinkedList<Integer> queue, StringTokenizer st) {
                if (queue.isEmpty()) {
                    return -1;
                }

                return queue.peekLast();
            }

        });

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            int result = map.get(command).process(queue, st);

            if (result != -2) {
                sb.append(result).append("\n");
            }

        }

        System.out.println(sb.toString());

    }
}

interface Command {
    public int process(LinkedList<Integer> queue, StringTokenizer st);
}