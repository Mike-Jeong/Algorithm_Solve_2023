package backjoon;

import java.io.*;
//import java.util.*;

//LCS 3
//28012023

public class b28012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                for (int j2 = 1; j2 <= s3.length(); j2++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(j2 - 1)) {
                        dp[i][j][j2] = dp[i - 1][j - 1][j2 - 1] + 1;
                    } else {
                        dp[i][j][j2] = Math.max(dp[i - 1][j][j2], Math.max(dp[i][j - 1][j2], dp[i][j][j2 - 1]));
                    }
                }
            }
        }

        System.out.println(dp[s1.length()][s2.length()][s3.length()]);

    }
}
