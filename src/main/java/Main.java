import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n ; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 12;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));

    }
}
