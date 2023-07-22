package backjoon;

import java.io.*;
import java.util.*;

//기술 연계마스터 임스
//22072023

public class b22072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 0);
        map.put('S', 0);

        String s = br.readLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'S') {
                map.replace('S', map.get('S') + 1);
                continue;
            }

            if (s.charAt(i) == 'L') {
                map.replace('L', map.get('L') + 1);
                continue;
            }

            if (s.charAt(i) == 'K') {
                if (map.get('S') < 1) {
                    break;
                }
                map.replace('S', map.get('S') - 1);
                count++;
                continue;
            }

            if (s.charAt(i) == 'R') {
                if (map.get('L') < 1) {
                    break;
                }
                map.replace('L', map.get('L') - 1);
                count++;
                continue;
            }

            count++;
        }

        System.out.println(count);

    }
}
