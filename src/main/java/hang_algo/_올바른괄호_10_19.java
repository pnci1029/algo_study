//import java.util.*;
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int leftCount = 0;
//        int rightCount = 0;
//
//        if (s.charAt(0) == ')') {
//            answer =  false;
//            leftCount++;
//        } else if (s.charAt(s.length() - 1) == '(') {
//            answer =  false;
//            rightCount++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                leftCount++;
//            } else {
//                rightCount++;
//            }
//            if (leftCount < rightCount) {
//                answer = false;
//            }
//        }
//        if (leftCount != rightCount) {
//            answer = false;
//        }
//
//
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        String s = "()()";
//        String s1 = "()))((()";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(s));
//        System.out.println(solution.solution(s1));
//    }
//}
