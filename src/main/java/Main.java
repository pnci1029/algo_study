class Solution {
    public long solution(int n) {
        long answer = 0;

        if (n < 3) {
            return n;
        } else {
            long left = 1;
            long right = 2;
            for (int i = 3; i <= n; i++) {
                answer = (left + right) % 1234567;
                if (i % 2 != 0) {
                    left = answer;
                } else {
                    right = answer;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        int a =1;
        Solution solution = new Solution();
        System.out.println(solution.solution(a));
    }
}
