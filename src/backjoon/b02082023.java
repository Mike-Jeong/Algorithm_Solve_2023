package backjoon;

import java.io.*;
// import java.util.*;

//아!
//02082023

public class b02082023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String t = br.readLine();

        System.out.println(s.length() >= t.length() ? "go" : "no");

    }
}
