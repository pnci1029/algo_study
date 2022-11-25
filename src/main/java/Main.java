import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];


        List<Integer> numb = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            numb.add(score[i]);
            Collections.sort(numb);
            if (numb.size() > k) {
                numb.remove(0);
            }
            answer[i] = numb.get(0);
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int[] b = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};


        Solution solution = new Solution();
        System.out.println(solution.solution(a, b));
    }
}
