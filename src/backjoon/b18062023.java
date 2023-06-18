package backjoon;

import java.io.*;
import java.util.*;

//카드
//18062023

public class b18062023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        Map<Long, Integer> nums = new HashMap<>();

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            Long num = Long.parseLong(st.nextToken());

            if (!nums.containsKey(num)) {
                nums.put(num, 1);
                continue;
            }

            nums.replace(num, nums.get(num) + 1);

        }

        List<Long> list = new ArrayList<>(nums.keySet());

        Collections.sort(list, new Comparator<Long>() {

            @Override
            public int compare(Long o1, Long o2) {

                if (nums.get(o1).equals(nums.get(o2))) {
                    return o1.compareTo(o2);
                }

                return nums.get(o2) - nums.get(o1);
            }

        });

        System.out.println(list.get(0));

    }
}
