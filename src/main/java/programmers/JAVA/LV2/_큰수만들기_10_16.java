//import java.util.*;
//
//class Solution {
//    public String solution(String number, int k) {
//        StringBuilder answer = new StringBuilder("");
//        int length = number.length() - k;
//        int a = 0;
//
//        while(a < number.length() && answer.length() != length) {
//            int leftNum = k + answer.length() + 1;
//            int max = 0;
//            for (int j = a; j < leftNum; j++) {
//                if (max < number.charAt(j) - '0') {
//                    max = number.charAt(j) - '0';
//                    a = j + 1;
//                    System.out.println("max = " + max);
//                    System.out.println("a = " + a);
//                }
//            }
//            answer.append(Integer.toString(max));
//        }
//        return answer.toString();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        String number = "1231234";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(number, 3));
//
//    }
//}
