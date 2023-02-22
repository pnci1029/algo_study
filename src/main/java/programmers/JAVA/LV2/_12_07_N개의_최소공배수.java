//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution {
//    public int solution(int[] arr) {
//        int answer = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            int max = Math.max(answer, arr[i]);
//            int min = Math.min(answer, arr[i]);
//
//            while (max%min !=0) {
//                int nam = max % min;
//
//                max = min;
//                min = nam;
//            }
//            answer = answer * arr[i] / min;
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
//        int [] a = {2, 6, 8, 14};
////        int [] a = {12, 32, 45, 67, 72};
////        int [] a = {5,10,15,20,25};
////        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
