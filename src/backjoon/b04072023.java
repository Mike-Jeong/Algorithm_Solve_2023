package backjoon;

import java.io.*;
import java.util.*;

//반지
//04072023

public class b04072023 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String target = st.nextToken();
            target += target;

            if (target.contains(s)) {
                ans++;
            }
        }

        System.out.println(ans);

    }

}
