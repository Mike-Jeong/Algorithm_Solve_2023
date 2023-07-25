package backjoon;

import java.io.*;
import java.util.*;

//암호해독기
//25072023

public class b25072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        Map<Character, Integer> map = new HashMap<>();
        map.put(' ', 0);

        int start = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put((char) start, i);
            start++;
        }

        start = 'a';
        for (int i = 27; i <= 52; i++) {
            map.put((char) start, i);
            start++;
        }

        int[] count = new int[53];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            count[num]++;
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            count[map.get(s.charAt(i))]--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("n");
                return;
            }
        }

        System.out.println("y");

    }
}
