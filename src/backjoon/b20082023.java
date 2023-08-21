package backjoon;

import java.io.*;
import java.util.*;

//사분면 고르기
//20082023

public class b20082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());

        if (x > 0 && y > 0) {
            System.out.println(1);
            return;
        }

        if (x > 0 && y < 0) {
            System.out.println(4);
            return;
        }

        if (x < 0 && y > 0) {
            System.out.println(2);
            return;
        }

        if (x < 0 && y < 0) {
            System.out.println(3);
            return;
        }

    }
}
