import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int result = 0;
        int numb = 0;
        String[] split = polynomial.split(" ");
        for (String s : split) {
            if (s.contains("x")) {
                if (s.equals("x")) {
                    result += 1;
                } else {
                    String value = s.replace("x", "");
                    result += Integer.parseInt(value);
                }
            } else if (!s.equals("+")) {
                numb += Integer.parseInt(s);
            }
        }
        if (result == 1) {
            if (numb != 0) {
                answer = "x + " + numb;
                return answer;
            } else {
                answer = "x";
                return answer;
            }
        }

        if (numb != 0 && result != 0) {
            answer = result + "x + " + numb;
        } else if (numb == 0) {
            answer = result + "x";
        } else if (result == 0) {
            answer = String.valueOf(numb);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String a = "7 + x";

        Solution solution = new Solution();
        System.out.println(solution.solution(a));

    }
}
