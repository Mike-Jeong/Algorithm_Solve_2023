package backjoon;

import java.io.*;
import java.util.*;

//팬들에게 둘러싸인 홍준
//11092023

public class b11092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = st.nextToken();

        System.out.println(":fan::fan::fan:");
        System.out.println(String.format(":fan::%s::fan:", s));
        System.out.println(":fan::fan::fan:");

    }
}
