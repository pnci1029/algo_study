//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public String solution(int n) {
//        String answer = "";
//
//        String[] numbBox = {"4", "1", "2"};
//        /**
//         * n을 3으로 나눴을 때
//         * 나머지가 1 -> 마지막 자리 1;
//         * 나머지가 2 -> 마지막 자리 2;
//         * 나머지가 0 -> 마지막 자리 4;
//         */
//
//
//        while (n > 0) {
//            answer = numbBox[n % 3] + answer;
//            n = (n - 1) / 3;
//        }
//
////            int nam = n % 3;
////            answer += numbBox[nam];
////            if (n != 0) {
////                box.add(numbBox[nam]);
////            }
//
//
//        System.out.println("answer = " + answer);
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int a = 11;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
