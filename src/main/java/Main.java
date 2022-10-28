import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar <= 90 && aChar >= 65) {
                if ((char) (aChar + n) > 90) {
                    answer += (char) (aChar + n -26);
                } else {
                    answer += (char) (aChar + n);
                }
            }
            if (aChar <= 122 && aChar >= 97) {
                if ((char) (aChar + n) > 122) {
                    answer += (char) (aChar + n -26);
                } else {
                    answer += (char) (aChar + n);
                }
            }

            if (aChar == ' ') {
                answer += ' ';
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
//        String s = "AB";
//        String s = "a B z";
//        String s = "z";
        String s = "Z";
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.solution(s, n));
    }
}
