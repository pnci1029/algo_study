//import java.util.*;
//
//class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        String[] box = new String[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            box[i] = String.valueOf(numbers[i]);
//        }
//
//        Arrays.sort(box, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2 + o1).compareTo(o1 + o2);
//            }
//        });
//
//        if (box[0].equals("0")) {
//            return "0";
//        }
//        for (String number : box) {
//            answer += number;
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {100, 900, 3, 30, 152, 161, 34, 51, 9, 95, 11, 991, 999, 151};
//        int [] a = {3, 30, 34, 5, 9};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
