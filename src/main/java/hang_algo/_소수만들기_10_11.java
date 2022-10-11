//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public int solution(int[] nums) {
//
////        boolean[] isPrime = new boolean[1000 + 1];
////        Arrays.fill(isPrime, true);
////
////        isPrime[0] = isPrime[1] = false;
////        for (int i = 2; i*i <= 1000; i++) {
////            if (isPrime[i]) {
////                for (int j = i * i; j < 1000; j+=i) {
////                    isPrime[j] = false;
////                }
////            }
////        }
//        int box = 0;
//
//        int answer = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    box = 0;
//                    int result = nums[i] + nums[j] + nums[k];
//                    for (int a = 2; a < result; a++) {
//                        if (result % a == 0) {
//                            box++;
//                        }
//                    }
//                    if (box == 0) {
//                        answer++;
//                    }
////                    if (isPrime[result] && i!= j && j != k && i<j && j<k) {
////                        answer++;
////                    }
//                }
//            }
//        }
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] result = {1, 2, 7, 6, 4};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(result));
//
//    }
//}
