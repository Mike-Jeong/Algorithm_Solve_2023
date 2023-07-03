package backjoon;

import java.io.*;
import java.util.*;

//집합
//03072023

public class b03072023 {

    private static boolean[] set = new boolean[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num;

            switch (st.nextToken()) {

                case "add":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = true;
                    break;

                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = false;
                    break;

                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = !set[num];
                    break;

                case "all":
                    for (int j = 0; j < 21; j++) {
                        set[j] = true;
                    }
                    break;
                case "empty":
                    for (int j = 0; j < 21; j++) {
                        set[j] = false;
                    }
                    break;
                case "check":
                    sb.append((set[Integer.parseInt(st.nextToken())] ? 1 : 0)).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);

    }

}
