package backjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//중복 빼고 정렬하기
//17032023

public class b17032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            set.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> list = set.stream()
                .sorted((o1, o2) -> o1 - o2)
                .collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
