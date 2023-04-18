package backjoon;

import java.io.*;
import java.util.*;

//X와 K
//18042023

public class b18042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long x = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        String stringX = Long.toBinaryString(x);
        String stringK = Long.toBinaryString(k);

        int index = stringK.length() - 1;

        for (int i = stringX.length() - 1; i >= 0; i--) {

            if (stringX.charAt(i) == '1') {
                sb.insert(0, 0);
            } else {

                if (index == -1) {
                    continue;
                }

                sb.insert(0, stringK.charAt(index));
                index--;

            }
        }

        while (index >= 0) {
            sb.insert(0, stringK.charAt(index));
            index--;
        }

        System.out.println(Long.parseLong(sb.toString(), 2));

    }
}
