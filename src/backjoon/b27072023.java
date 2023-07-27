package backjoon;

import java.io.*;
import java.util.*;

//크냐?
//27072023

public class b27072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                System.out.println(sb);
                return;
            }

            sb.append(n > m ? "Yes" : "No").append("\n");

        }
    }
}
