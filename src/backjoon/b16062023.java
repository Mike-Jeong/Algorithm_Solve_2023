package backjoon;

import java.io.*;
import java.util.*;

//30
//16062023

public class b16062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String num = st.nextToken();

        int[] nums = new int[10];

        int totalCount = 0;

        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt(num.substring(i, i + 1));
            nums[n] += 1;
            totalCount += n;
        }

        if (!num.contains("0") || totalCount % 3 != 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 9; i >= 0; i--) {
            while (nums[i] > 0) {
                sb.append(i);
                nums[i]--;
            }
        }

        System.out.println(sb);

    }
}
