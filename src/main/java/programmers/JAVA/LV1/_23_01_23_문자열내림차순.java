//package com.example.tdd_prac;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        List<Character> big = new ArrayList<>();
//        List<Character> small = new ArrayList<>();
//        char[] chars = s.toCharArray();
//        for (char aChar : chars) {
//            if (aChar >= 'a' && aChar <= 'z') {
//                small.add(aChar);
//            } else if (aChar >= 'A' && aChar <= 'Z') {
//                big.add(aChar);
//            }
//        }
//
//        Collections.sort(big);
//        Collections.sort(small);
//        for (int i = small.size() - 1; i >= 0; i--) {
//            answer += small.get(i);
//        }
//        for (int i = big.size() - 1; i >= 0; i--) {
//            answer += big.get(i);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        String a = "ZbcdWRWWefag";
//        Solution solution = new Solution();
//        String solution1 = solution.solution(a);
//        System.out.println(solution1);
//    }
//}
