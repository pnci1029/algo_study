//import java.util.Arrays;
//import java.util.Collections;
//
//class Solution {
//    public int solution(int[] d, int budget) {
//        int answer = 0;
//
//        Arrays.sort(d);
//
//        for (int i = 0; i < d.length; i++) {
//            if (budget-d[i] >= 0) {
//                budget -= d[i];
//                answer++;
//            } else {
//                break;
//            }
//        }
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] board = {1, 3, 2, 5, 4};
//        int b = 9;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(board,b));
//    }
//}
