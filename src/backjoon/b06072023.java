package backjoon;

import java.io.*;
import java.util.*;

//키 큰 사람
//06072023

public class b06072023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }

            double maxHeight = 0.00;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double height = Double.parseDouble(st.nextToken());

                if (height > maxHeight) {
                    maxHeight = height;
                    list = new ArrayList<>();
                    list.add(name);
                    continue;
                }

                if (height == maxHeight) {
                    list.add(name);
                    continue;
                }
            }

            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

}
