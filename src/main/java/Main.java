
class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] split = s.split("");

        String word = "";

        int left = 0;
        int right = 0;

        word = split[0];
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            if (count == 0) {
                word = split[i];
            }
            if (split[i].equals(word)) {
                left++;
            } else {
                right++;
            }
            count++;
            if (left == right) {
                answer++;
                count = 0;
                left = 0;
                right =0;
            }
        }

        if (left != 0 || right != 0) {
            return answer + 1;
        } else {
            return answer;
        }

    }
}

public class Main {
    public static void main(String[] args) {


        String a = "abbaaa";

        Solution solution = new Solution();
        System.out.println(solution.solution(a));
    }
}
