//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution {
//    public int solution(int[] arrayA, int[] arrayB) {
//        int answer = 0;
//
//        Arrays.sort(arrayA);
//        Arrays.sort(arrayB);
//
//        int maxA = 0;
//        int maxB = 0;
//        int count = 0;
////        배열A 최대공약수
//        for (int i = arrayA[0]; i >=2; i--) {
//            count = 0;
//            for (int target : arrayA) {
//                if (target % i == 0) {
//                    count++;
//                }else {
//                    break;
//                }
//            }
//            if (count == arrayA.length) {
//                maxA = i;
//                break;
//            }
//        }
////        배열B 최대공약수 제일 큰 수에서 2까지
//        for (int i = arrayB[0]; i >=2; i--) {
//            count = 0;
//            for (int target : arrayB) {
//                if (target % i == 0) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            if (count == arrayB.length) {
//                maxB = i;
//                break;
//            }
//        }
//
////        A최대공약수로 배열B 나눠지는거 있는지 확인
//        int countA = 0;
//        int countB = 0;
//        if (maxB != 0) {
//            for (int i : arrayA) {
//                if (i % maxB == 0) {
//                    countA++;
//                }
//            }
//
//        }
////        A최대공약수로 배열B 나눠지는거 있는지 확인
//        if (maxA != 0) {
//            for (int i : arrayB) {
//                if (i % maxA == 0) {
//                    countB++;
//                }
//            }
//        }
////        System.out.println("countA = " + countA);
////        System.out.println("countB = " + countB);
////        System.out.println("maxA = " + maxA);
////        System.out.println("maxB = " + maxB);
//        if (countA >= 1 && countB >= 1) {
//            return 0;
//        } else if (countA == 0 && countB == 0) {
//            answer = Math.max(maxA, maxB);
//            return answer;
//        } else if (countA == 0 && countB != 0) {
//            return maxB;
//        } else {
//            return maxA;
//        }
//
//
////        count = 0;
////        for (int target : arrayB) {
////            if (maxA == 0) {
////                return 0;
////            } else if (target % maxA == 0) {
////                return 0;
////            } else {
////                count++;
////            }
////
////        }
////        if (count == arrayB.length) {
////            answer = maxA;
////        }
////        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {14, 35, 119};
////        int[] b = {18,30,102};
//        int[] a = {10,17};
//        int[] b = {5,20};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b));
//
//    }
//}
