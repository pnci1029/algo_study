//import java.util.Arrays;
//
//class Solution {
//
//    int[] numbers;
//    int target;
//    int answer;
//    void dfs(int index, int sum) {
//
//        if (index == numbers.length) {
//            if (sum == target) {
//                answer++;
//            }
//            return;
//
//        }
//
//        dfs(index + 1, sum + numbers[index]);
//        dfs(index + 1, sum - numbers[index]);
//
//    }
//
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//
//        this.numbers = numbers;
//        this.target = target;
//        dfs(0, 0);
//
//        return this.answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {4, 1, 2, 1};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,4));
//
//    }
//}
