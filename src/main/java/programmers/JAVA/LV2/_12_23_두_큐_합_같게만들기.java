//import java.util.*;
//
//class Solution {
//    public long solution(int[] queue1, int[] queue2) {
//        int count = 0;
//
//        Queue<Long> boxA = new ArrayDeque<>();
//        Queue<Long> boxB = new ArrayDeque<>();
//        long total = 0;
//        long totalA = 0;
//        long totalB = 0;
//
//        for (int i = 0; i < queue1.length; i++) {
//            boxA.add((long) queue1[i]);
//            boxB.add((long) queue2[i]);
//            total += queue1[i] + queue2[i];
//            totalA += queue1[i];
//            totalB += queue2[i];
//        }
//        if (total % 2 != 0) {
//            return -1;
//        }
//        if (totalA == totalB) {
//            return count;
//        }
//
//        total /= 2;
//
//        int targetA = 0;
//        int targetB = 0;
//        while (targetA<= queue1.length*2 && targetB<= queue2.length*2) {
//            if (totalA == total) {
//                return count;
//            }
//
//            if (totalA > total) {
//                totalA -= boxA.peek();
//                totalB += boxA.peek();
//                boxB.add(boxA.poll());
//                count++;
//                targetA++;
//            } else {
//                totalB -= boxB.peek();
//                totalA += boxB.peek();
//                boxA.add(boxB.poll());
//                count++;
//                targetB++;
//            }
//        }
//        return -1;
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
////        int[] a = {1, 2, 4};
////        int[] b = {3,2,4};
////        int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
////        int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] a = {1, 1, 1, 9, 1};
//        int[] b = {1, 1, 1, 1, 1};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b));
//
//    }
//}
