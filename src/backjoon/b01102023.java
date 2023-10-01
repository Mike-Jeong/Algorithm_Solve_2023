package backjoon;

import java.io.*;
import java.util.*;

//킹, 퀸, 룩, 비숍, 나이트, 폰
//01102023

public class b01102023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int ki = Integer.parseInt(st.nextToken());
        sb.append(1 - ki).append(" ");
        int q = Integer.parseInt(st.nextToken());
        sb.append(1 - q).append(" ");
        int r = Integer.parseInt(st.nextToken());
        sb.append(2 - r).append(" ");
        int b = Integer.parseInt(st.nextToken());
        sb.append(2 - b).append(" ");
        int kn = Integer.parseInt(st.nextToken());
        sb.append(2 - kn).append(" ");
        int p = Integer.parseInt(st.nextToken());
        sb.append(8 - p);

        System.out.println(sb);

    }
}
