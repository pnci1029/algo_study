import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n, long left, long right) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            result.add((int)(Math.max(i / n, i % n) +1));
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int n =4;
        long a =7;
        long b =14;
        Solution solution = new Solution();
        System.out.println(solution.solution(n,a,b));
    }
}
