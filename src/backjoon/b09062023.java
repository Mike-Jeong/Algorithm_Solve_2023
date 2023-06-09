package backjoon;

import java.io.*;
import java.util.*;

//베스트셀러
//09062023

public class b09062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Map<String, Integer> books = new HashMap<>();

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            String book = st.nextToken();

            if (!books.containsKey(book)) {
                books.put(book, 1);
                continue;
            }

            books.replace(book, books.get(book) + 1);

        }

        List<String> list = new ArrayList<>(books.keySet());

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                if (books.get(s1) == books.get(s2)) {
                    return s1.compareTo(s2);
                }

                return books.get(s2) - books.get(s1);
            }

        });

        System.out.println(list.get(0));

    }

}
