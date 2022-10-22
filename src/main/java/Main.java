import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
        int newBottle = 0;

        while (n >= a) {

            count = n / a;
            System.out.println("count = " + count);
            n -= count * a;
            System.out.println("n = " + n);
            newBottle = count * b;
            answer += newBottle;
            n += newBottle;

        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int a= 2;
        int b = 1;
        int c = 20;
        Solution solution = new Solution();
        System.out.println(solution.solution(a,b,c));
    }
}
