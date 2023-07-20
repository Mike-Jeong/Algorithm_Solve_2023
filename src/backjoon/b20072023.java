package backjoon;

import java.io.*;
import java.util.*;

//곰곰이의 식단 관리
//20072023

public class b20072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int c = 0;

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C') {
                c++;
            }
        }

        System.out.println((c / (n - c + 1)) + (c % (n - c + 1) != 0 ? 1 : 0));

    }
}
