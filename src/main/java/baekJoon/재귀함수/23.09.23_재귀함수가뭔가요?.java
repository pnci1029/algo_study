package baekJoon.재귀함수;

import java.util.*;

/**
 4 11
 802
 743
 457
 539

 1 3
 3
 */

public class 재귀함수가뭔가요 {
//    private static int N = 0;
    private static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        M = length;

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        DFS("", 0);
        System.out.println(sb);


    }

    public static void DFS(String underLine, int count) {
        if (count == M) {
            sb.append(underLine)
                    .append("\"재귀함수가 뭔가요?\"\n")
                    .append(underLine)
                    .append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n")
                    .append(underLine)
                    .append("라고 답변하였지.\n");

            return;
        }
        sb.append(underLine)
                .append("\"재귀함수가 뭔가요?\"\n")
                .append(underLine)
                .append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n")
                .append(underLine)
                .append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n")
                .append(underLine)
                .append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        DFS(underLine + "____", count+1);
        sb.append(underLine)
                .append("라고 답변하였지.\n");

    }

}

