import java.util.*;

class Solution {
    static int[] numbBox;
    static int[] box =new int[3];
    static int answerCount = 0;
    static boolean[] checkBox;


    public int solution(int[] number) {
        int N = number.length;
        int answer = 0;
        checkBox = new boolean[N];
        numbBox = number;
        DFS(0,0);


        return answerCount;
    }

    public void DFS(int idx, int depth) {
        if (depth == 3) {
            int answer = 0;
            for (int i = 0; i < 3; i++) {
                answer += box[i];
            }
            if (answer == 0) {
                answerCount++;
            }
            return;
        }
        for (int i = idx; i < numbBox.length; i++) {
            if (!checkBox[i]) {
                box[depth] = numbBox[i];
                checkBox[i] = true;
                DFS(i + 1, depth + 1);
                checkBox[i] = false;
            }

        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        Solution solution = new Solution();
        System.out.println(solution.solution(number));

    }
}
