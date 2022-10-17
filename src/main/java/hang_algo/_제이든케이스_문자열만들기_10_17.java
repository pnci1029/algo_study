//import java.util.*;
//
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//
//        String[] split = s.split("");
//
//
//        answer += split[0].toUpperCase();
//        for (int i = 0; i < split.length-1; i++) {
//            if (split[i].equals(" ")) {
//                answer +=split[i + 1].toUpperCase();
//            } else {
//                answer += split[i+1].toLowerCase();
//
//            }
//
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        String number = "3people unFollowed me";
//        String number1 = "a a a a a              a a a a a ";
//        String number2 = "for the last week";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(number));
//        System.out.println(solution.solution(number1));
//        System.out.println(solution.solution(number2));
//
//
//
//    }
//}
