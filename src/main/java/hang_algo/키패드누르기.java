//import java.util.*;
//
//class Solution {
//    public String solution(int[] numbers, String hand) {
//        String answer = "";
//        int left = 10;
//        int right = 12;
//
//        for (int n : numbers) {
//
//            if (n == 1 || n == 4 || n == 7) {
//                answer += "L";
//                left = n;
//            } else if (n == 3 || n == 6 || n == 9) {
//                answer += "R";
//                right = n;
//            } else if (n == 0) {
//                n += 11;
//            }
//            int leftWin = Math.abs(n - left)/3+ Math.abs(n - left)%3;
//            int rightWin = Math.abs(n - right)/3 + Math.abs(n - right)%3;
//            if (n == 2 || n == 5 || n == 8 || n == 11) {
//                if (leftWin < rightWin) {
//                    answer += "L";
//                    left = n;
//                } else if (leftWin > rightWin) {
//                    answer += "R";
//                    right = n;
//                } else if (leftWin == rightWin) {
//                    if (hand.equals("left")) {
//                        answer += "L";
//                        left = n;
//                    } else if (hand.equals("right")) {
//                        answer += "R";
//                        right = n;
//                    }
//                }
//            }
//
//
//        }
///**     LLLLLRLLLRR  left 7
// *      LRLLRRLLLRR  right 11
// */
//
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand = "left";
//        Solution sol = new Solution();
//        System.out.println(sol.solution(numbers, hand));
//
//    }
//}
