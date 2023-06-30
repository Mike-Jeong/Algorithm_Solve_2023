package backjoon;

import java.io.*;
import java.util.*;

//큰 수 구성하기
//30062023

public class b30062023 {

    static int n, k, ans;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        nums = new int[k];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {

            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        recurstion(0);

        System.out.println(ans);

    }

    public static void recurstion(int num) {

        if (num > n) {
            return;
        }

        if (ans < num) {
            ans = num;
        }

        for (int i = k - 1; i >= 0; i--) {
            recurstion(num * 10 + nums[i]);
        }
    }
}
