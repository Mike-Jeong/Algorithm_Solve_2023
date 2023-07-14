package backjoon;

import java.io.*;
// import java.util.*;

//무한 문자열
//14072023

public class b14072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String t = br.readLine();

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < t.length(); i++) {
            str1 += s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            str2 += t;
        }

        System.out.println(str1.equals(str2) ? 1 : 0);
    }
}
