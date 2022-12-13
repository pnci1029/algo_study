import java.util.Arrays;

class Solution {
    public int[] solution(int n, long k) {
        int[] box = new int[n];
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            box[n - i] = i;
        }




        return box;
    }
}
public class Main {
    public static void main(String[] args) {
        int orders = 3;
        int a = 5;
        Solution solution = new Solution();
        System.out.println(solution.solution(orders,a));

    }
}
