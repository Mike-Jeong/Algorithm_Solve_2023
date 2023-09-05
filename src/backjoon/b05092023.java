package backjoon;

import java.io.*;
import java.util.*;

//조별과제를 하려는데 조장이 사라졌다
//05092023

public class b05092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int ans = 0;

        while (n > 5) {
            n -= 5;
            ans++;

            if (n <= 5) {
                break;
            }
        }

        System.out.println(ans + 1);

    }
}
