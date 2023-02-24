package com.example.tdd_prac;


import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            String[] split = keymap[i].split("");
            for (int j = 0; j < split.length; j++) {
                if (!map.containsKey(split[j])) {
                    map.put(split[j], j + 1);
                } else {
                    if (map.get(split[j]) > j) {
                        map.put(split[j], j + 1);
                    }

                }
            }
        }
        System.out.println("map = " + map);
        for (int j =0; j< targets.length;j++) {
            String[] split = targets[j].split("");
            for (int i = 0; i < split.length; i++) {
                if (map.containsKey(split[i])) {
                    answer[j] += map.get(split[i]);
                } else {
                    answer[j] = -1;
                    break;
                }
            }
        }
        return answer;




    }
    public static void main(String[] args) {

        String[] a = {"ABACD", "BCEFD"};
        String[] b = {"ABCD", "AABB"};
//        String[] a = {"AGZ", "BSSS"};
//        String[] b = {"ASA", "BGZ"};
//        String[] a = {"AA", "AA"};
//        String[] b = {"B"};
        Solution solution2 = new Solution();
        System.out.println("solution2 = " + Arrays.toString(solution2.solution(a,b)));;
    }

}
