package backjoon;

import java.io.*;
import java.util.*;

//정보보호학부 동아리 소개
//19092023

public class b19092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("M", "MatKor");
        map.put("W", "WiCys");
        map.put("C", "CyKor");
        map.put("A", "AlKor");
        map.put("$", "$clear");

        System.out.print(map.get(st.nextToken()));
    }
}
