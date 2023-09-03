package backjoon;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

//큰 수 곱셈
//03092023

public class b03092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());

        System.out.println(a.multiply(b));

    }
}
