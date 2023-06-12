package backjoon;

import java.io.*;
import java.util.*;

//피보나치 수의 확장
//12062023

public class b12062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            System.out.println(0);
            return;
        }

        if (n == -1 || n == 1) {
            System.out.println(1);
            System.out.println(1);
            return;
        }

        int n_abs = Math.abs(n);

        int first = 0;
        int second = 1;
        int target = 1;
        int count = 2;

        while(true) {
            if (count == n_abs) {
                
                if (0 > n) {
                    System.out.println(n % 2 == 0 ? -1 : 1);
                } else {
                    System.out.println(1);
                }
                    
                System.out.println(target);
                break;
            }
                    
            first = second;
            second = target;
            target = (first + second) % 1000000000;
            count++;
            
        }
    }

}
