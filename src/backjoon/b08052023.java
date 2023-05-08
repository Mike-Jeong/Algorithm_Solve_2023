package backjoon;

import java.io.*;
import java.util.*;

//통계학
//08052023

public class b08052023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        int[] plus = new int[4002];
        int[] minus = new int[4001];

        int total = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            nums[i] = Integer.parseInt(st.nextToken());
            total += nums[i];

            if (nums[i] < 0) {
                minus[Math.abs(nums[i])]++;
                max = Math.max(max, minus[Math.abs(nums[i])]);
            }

            else {
                plus[nums[i]]++;
                max = Math.max(max, plus[nums[i]]);
            }
        }

        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            if (i < 0) {
                if (minus[Math.abs(i)] == max && !(list.contains(i))) {
                    list.add(i);
                }
            } else {
                if (plus[i] == max && !(list.contains(i))) {
                    list.add(i);
                }
            }
        }

        int mean = (int) Math.round(((double) total) / ((double) n));
        int median = nums[n / 2];
        int mode = list.size() > 1 ? list.get(1) : list.get(0);
        int range = nums[n - 1] - nums[0];

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);

    }
}
