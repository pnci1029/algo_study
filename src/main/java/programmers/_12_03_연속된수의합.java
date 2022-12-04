//import java.util.*;
//
//class Solution {
//    public List<Integer> solution(int num, int total) {
//
//        List<Integer> box;
//
//        int startNumb = total;
//        if (total == 0) {
//            startNumb = 50;
//        }
//        while (true) {
//            box = new ArrayList<>();
//
//            int result = 0;
//
//            for (int i = startNumb; ; i--) {
//                result += i;
//                box.add(i);
//                if (box.size() == num) {
//                    break;
//                }
//            }
//            result = 0;
//            startNumb--;
//            for (Integer integer : box) {
//                result += integer;
//            }
//            if (result == total) {
//                break;
//            }
//
//
//        }
//        Collections.reverse(box);
//
//
//        return box;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int b = 3;
//        int a = 0;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(b, a));
//    }
//}
