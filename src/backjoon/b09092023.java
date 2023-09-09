package backjoon;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

//A+B - 9
//09092023

public class b09092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());

        System.out.println(a.add(b));

    }
}
