package backjoon;

import java.io.*;
import java.util.*;

//재귀함수가 뭔가요?
//22042023

public class b22042023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");

        recursion(0, n, sb);

        System.out.println(sb);

    }

    private static void recursion(int index, int endIndex, StringBuilder sb) {

        addUnder(index, sb);
        sb.append("\"재귀함수가 뭔가요?\"").append("\n");

        if (index == endIndex) {
            addUnder(index, sb);
            sb.append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
            addUnder(index, sb);
            sb.append("라고 답변하였지.").append("\n");
            return;
        }

        addUnder(index, sb);
        sb.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
        addUnder(index, sb);
        sb.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
        addUnder(index, sb);
        sb.append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
        recursion(index + 1, endIndex, sb);
        addUnder(index, sb);
        sb.append("라고 답변하였지.").append("\n");

    }

    private static void addUnder(int index, StringBuilder sb) {
        for (int i = 0; i < index; i++) {
            sb.append("____");
        }
    }

}
