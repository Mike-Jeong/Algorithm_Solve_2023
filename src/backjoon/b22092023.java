package backjoon;

import java.io.*;
import java.util.*;

//특별한 학교 이름
//22092023

public class b22092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");

        System.out.println(map.get(st.nextToken()));
    }
}
