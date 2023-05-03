package backjoon;

import java.io.*;
import java.util.*;

//뒤집기
//03052023

public class b03052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st0 = new StringTokenizer(s, "0");
        StringTokenizer st1 = new StringTokenizer(s, "1");
        // StringBuilder sb = new StringBuilder();

        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));

    }
}
