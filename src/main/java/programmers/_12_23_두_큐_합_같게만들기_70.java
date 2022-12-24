//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//class Solution {
//    public long solution(int[] queue1, int[] queue2) {
//        int answer = -2;
//        long count = 0;
//
//        long totalA = 0;
//        long totalB = 0;
//
//        List<Long> boxA = new ArrayList<>();
//        List<Long> boxB = new ArrayList<>();
//
//        long total = 0;
//        int max = 0;
//        for (int i = 0; i< queue1.length; i++) {
////            max = Math.max(max, Math.max(queue1[i], queue2[i]));
//            total += queue1[i] + queue2[i];
//            boxA.add((long)queue1[i]);
//            boxB.add((long)queue2[i]);
//        }
//        for (int i = 0; i < boxA.size(); i++) {
//            totalA += boxA.get(i);
//            totalB += boxB.get(i);
//        }
//        if (total % 2 != 0) {
//            return -1;
//        } else if (totalA == totalB) {
//            return 0;
//        }
//        total = total / 2;
//
////        if (max > total) {
////            return -1;
////        }
//
//        while (true) {
//
//            if (totalA > totalB) {
//                long idx = boxA.get(0);
//                boxA.remove(0);
//                boxB.add(idx);
//                count++;
//            } else {
//                long idx = boxB.get(0);
//                boxB.remove(0);
//                boxA.add(idx);
//                count++;
//            }
//            totalA = 0;
//            totalB = 0;
//
//            for (Long integer : boxA) {
//                totalA += integer;
//            }
//            for (Long integer : boxB) {
//                totalB += integer;
//            }
//
////            break;
//            if (totalA == totalB || totalB == total) {
//                break;
//            }
//            if (count > boxA.size() + boxB.size()+1) {
//                count = -1;
//                break;
//            }
////            if (boxA.size() > 300000 || boxB.size() > 300000) {
////                return -1;
////            }
//        }
//
//        return count;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
////        int[] a = {3, 2, 7, 2};
////        int[] b = {4, 6, 5, 1};
//
//        int[] a = {1, 2, 4};
//        int[] b = {3,2,4};
////        int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
////        int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
////        int[] a = {1, 1, 1, 9, 1};
////        int[] b = {1, 1, 1, 1, 1};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b));
//
//    }
//}
