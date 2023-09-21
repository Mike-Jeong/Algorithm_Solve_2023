package backjoon;

import java.io.*;
import java.util.*;

//진흥원 세미나
//21092023

public class b21092023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            System.out.println(map.get(br.readLine()));
        }
    }
}
