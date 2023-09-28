package backjoon;

import java.io.*;
import java.util.*;

//카드 게임
//28092023

public class b28092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(sum);
    }
}
