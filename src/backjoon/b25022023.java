package backjoon;

import java.io.*;
import java.util.*;

//Z
//25022023

public class b25022023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(recursion(0, 0, (int) Math.pow(2, n), r, c, 0));
    }

    private static int recursion(int row, int col, int lenght, int targetR, int targetC, int count) {

        if (lenght == 1) {
            return count;
        }

        int addC = (lenght / 2) * (lenght / 2);
        if ((row <= targetR && row + (lenght / 2) > targetR)
                && (col <= targetC && col + (lenght / 2) > targetC)) {
            return recursion(row, col, lenght / 2, targetR, targetC, count);
        } else if ((row <= targetR && row + (lenght / 2) > targetR)
                && (col + (lenght / 2) <= targetC && col + 2 * (lenght / 2) > targetC)) {
            return recursion(row, col + (lenght / 2), lenght / 2, targetR, targetC, count + addC);
        } else if ((row + (lenght / 2) <= targetR && row + 2 * (lenght / 2) > targetR)
                && (col <= targetC && col + (lenght / 2) > targetC)) {
            return recursion(row + (lenght / 2), col, lenght / 2, targetR, targetC, count + 2 * addC);
        } else {
            return recursion(row + (lenght / 2), col + (lenght / 2), lenght / 2, targetR, targetC, count + 3 * addC);
        }
    }
}