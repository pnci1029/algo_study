//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution {
//    public long[] solution(long begin, long end) {
//        long[] answer = new long[(int) (end - begin + 1)];
//        Arrays.fill(answer, 1);
//        for (long i = begin; i <= end; i++) {
//            if (i == 1) {
//                answer[(int) (i - begin)] = 0;
//            }
//            for (long j = Math.max(2, i / 10000000); j * j <= i; j++) {
//                if (i % j == 0 && i/j <= 10000000) {
//
//                    answer[(int) (i - begin)] = (int) i / j;
//                    break;
//                }
//            }
//        }
//
//
//        List<Integer> box = new ArrayList<>();
//
////        for (long i = begin; i <= end; i++) {
//////            System.out.println("i = " + i);
////            if (i == 1) {
////                box.add(0);
////            } else {
////                int count = 0;
////                int max = 0;
//////                for (int j = (int) Math.sqrt(i); j <i; j++) {
////                for (long j =  (i-1); j >=Math.sqrt(i); j--) {
//////                    System.out.println("j = " + j);
////                        if (i % j == 0) {
////                            System.out.println("j = " + j);
////                            if (j >= 1000000) {
////                                box.add(1);
////                                break;
////                            }
//////                        max = j;
////                            box.add((int) j);
////                            count++;
////                            break;
////                        }
////                }
////                if (count == 0) {
////                    box.add(1);
////                }
//////                else {
//////                    box.add(max);
//////                }
////            }
////        }
//
//
//
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
////        int a =1;
////        int b =10;
////        int a = 11;
////        int b = 20;
//        int a = 999999990;
//        int b = 1000000000;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//
//    }
//}
