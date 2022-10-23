import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> result = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!result.isEmpty() && result.peek() == c) {
                result.pop();
            } else {
                result.push(c);
            }
        }
        if (result.size() == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        String s = "cdcd";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
}
