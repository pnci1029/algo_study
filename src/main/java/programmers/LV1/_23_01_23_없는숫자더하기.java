//package com.example.tdd_prac;
//
//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//        Arrays.sort(numbers);
//        int min = numbers[0];
//        int max = numbers[numbers.length - 1];
//        for (int i = 0; i <= 9; i++) {
//            int count = 0;
//            for (int number : numbers) {
//                if (i == number) {
//                    count++;
//                }
//            }
//            if (count == 0) {
//                answer += i;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 6, 7, 8, 0};
//        Solution solution = new Solution();
//        int solution1 = solution.solution(a);
//        System.out.println(solution1);
//    }
//}
