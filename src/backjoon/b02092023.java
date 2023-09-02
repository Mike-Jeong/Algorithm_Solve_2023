package backjoon;

import java.io.*;
import java.util.*;

//코드마스터 2023
//02092023

public class b02092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("SONGDO", "HIGHSCHOOL");
        map.put("CODE", "MASTER");
        map.put("2023", "0611");
        map.put("ALGORITHM", "CONTEST");

        System.out.println(map.get(st.nextToken()));

    }
}
