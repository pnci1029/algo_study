class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split("");

        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(" ")) {
                count = 1;
            } else if (count % 2 == 0) {
                s1[i] = s1[i].toUpperCase();
            } else {
                s1[i] = s1[i].toLowerCase();
            }
            answer += s1[i];
            count++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String box = "try hello world";
//        String box = "  tRy hello  WORLD    ";
        Solution solution = new Solution();
        System.out.println(solution.solution(box));
    }
}
