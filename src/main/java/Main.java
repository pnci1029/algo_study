import java.util.Collections;
import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            letter.append(ingredient[i]);
            if (letter.length() > 3 && letter.subSequence(letter.length() - 4, letter.length()).equals("1231")) {
                answer++;
                letter.delete(letter.length() - 4, letter.length());
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] box = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] box = {1, 3, 2, 1, 2, 1, 3, 1, 2};
//        int[] box = {1,2,1,2,3,1,3,1,2,3,1,2,3,1};
//        int[] box = {1,2,2,3,1};



        Solution solution = new Solution();
        System.out.println(solution.solution(box));
    }
}
