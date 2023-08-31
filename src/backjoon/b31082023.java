package backjoon;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

//A+B
//31082023

public class b31082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        BigDecimal a = new BigDecimal(st.nextToken());
        st = new StringTokenizer(br.readLine());
        BigDecimal b = new BigDecimal(st.nextToken());

        System.out.println(a.add(b));

    }
}
