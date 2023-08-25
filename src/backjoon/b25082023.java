package backjoon;

import java.io.*;
import java.util.*;

//1998년생인 내가 태국에서는 2541년생?!
//25082023

public class b25082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());

        System.out.println(a - 543);
    }
}
