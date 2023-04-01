package com.example.tdd_prac;

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] arr = photo[i];
            for (String s : arr) {
                if (map.containsKey(s)) {
                    answer[i] += map.get(s);
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {

        String[] a = {"may", "kein", "kain", "radi"};
        int[] b = {5, 10, 1, 3};
        String[][] c = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.solution(a,b,c)));
    }

}
