package com.example.tdd_prac;

import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;


        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();

        for (int i : topping) {
            map.put(i, 0);
        }

        Set<Integer> box = new HashSet<>();
        for (int i = 0; i < topping.length; i++) {
            box.add(topping[i]);
            start.put(i, box.size());
        }

        box = new HashSet<>();
        for (int i = topping.length - 1; i >= 0; i--) {
            box.add(topping[i]);
            end.put(i, box.size());
        }

        for (int i = 0; i < start.size()-1; i++) {
            if (start.get(i).equals(end.get(i+1))) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

//        int[] a = {1, 2, 1, 3, 1, 4, 1, 2};
        int[] a = {1, 2, 3, 1, 4};
        Solution solution = new Solution();
        int solution1 = solution.solution(a);
        System.out.println("solution1 = " + solution1);
    }
}

