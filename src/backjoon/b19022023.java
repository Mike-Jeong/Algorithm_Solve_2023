package backjoon;

import java.io.*;
import java.util.*;

//텀 프로젝트
//19022023

public class b19022023 {

    static int[] nums;
    static boolean[] visited;
    static int count;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            nums = new int[n + 1];
            visited = new boolean[n + 1];
            count = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    findCycle(i, new HashSet<>());
                    if (!visited[i]) {
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);

    }

    private static void findCycle(int currnt, Set<Integer> set) {

        if (set.contains(currnt)) {
            markCycle(currnt);
            return;
        }

        set.add(currnt);
        findCycle(nums[currnt], set);

    }

    private static void markCycle(int currnt) {
        if (visited[currnt]) {
            return;
        }

        visited[currnt] = true;
        markCycle(nums[currnt]);
    }
}// 시간초과 코드


//통과 코드
//코사라주 알고리즘 적용
/*
import java.io.*;
import java.util.*;

//텀 프로젝트
//19022023

public class Main {

    static int[] nums;
    static boolean[] visited;
    static boolean[] marked;
    static int count;
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            nums = new int[n + 1];
            visited = new boolean[n + 1];
            marked = new boolean[n + 1];
            count = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
               recursion(i);
            }

            sb.append(n - count).append("\n");
        }

        System.out.println(sb);

    }

    private static void recursion(int current) {

        if (visited[current]) {
            return;
        }

        visited[current] = true;

        if (!visited[nums[current]]) {
            recursion(nums[current]);
        } else {
            if (!marked[nums[current]]) {

                count++;

                for (int i = nums[current]; i != current; i = nums[i]) {
                    count++;
                }
            }
        }

        marked[current] = true;

    }
}
*/
