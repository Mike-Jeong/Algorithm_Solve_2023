package backjoon;

import java.io.*;
import java.util.*;

//인사성 밝은 곰곰이
//24032023

public class b24032023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        int ans = 0;
        for (int i = 0; i < n; i++) {

            String name = br.readLine();

            if ("ENTER".equals(name)) {
                ans += set.size();

                set = new HashSet<>();
                continue;
            }

            set.add(name);

        }

        System.out.println(ans + set.size());
    }
}
