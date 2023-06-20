package backjoon;

import java.io.*;
import java.util.*;

//빈도 정렬
//20062023

public class b20062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[][] cows = new int[n][2];
        
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            cows[i][0] = Integer.parseInt(st.nextToken());
            cows[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cows, (o1, o2) -> {

            if (o1[0] == o2[0]) {
                
                return o1[1] - o2[1];
            }

            return o1[0] - o2[0];}

        });

        int ans = 0;

        for (int i = 0; i < n; i++) {
            
            if (ans < cows[i][0]) {
                ans = cows[i][0];
            }

            ans += cows[i][1];
        }

        System.out.println(ans);

    }
}
