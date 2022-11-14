//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        int left = 2;
//        int right = 3;
//        for (int i = 2; i < n-1; i++) {
//            answer = (left + right)% 1000000007;
//            if (i % 2 == 0) {
//                left = answer;
//            } else {
//                right = answer;
//            }
//        }
//        return answer ;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int n = 6;
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
//    }
//}
