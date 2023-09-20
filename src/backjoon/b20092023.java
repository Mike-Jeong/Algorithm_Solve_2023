package backjoon;

import java.io.*;
import java.util.*;

//2033 밈 투표
//20092023

public class b20092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Set<String> set = new HashSet<>();

        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            if (set.contains(br.readLine())) {
                continue;
            }

            System.out.println("Yes");

            return;
        }

        System.out.println("No");
    }
}
