package backjoon;

import java.io.*;
import java.util.*;

//팩토리얼 0의 개수
//02072023

public class b02072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int count = 0;

        while (n >= 5) {

            count += n / 5;
            n /= 5;
        }

        System.out.println(count);

    }
}
