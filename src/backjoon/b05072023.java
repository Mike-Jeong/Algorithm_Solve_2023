package backjoon;

import java.io.*;
import java.util.*;

//창문 닫기
//05072023

public class b05072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 1; i * i <= n; i++) {
            ans++;
        }

        System.out.println(ans);

    }

}
