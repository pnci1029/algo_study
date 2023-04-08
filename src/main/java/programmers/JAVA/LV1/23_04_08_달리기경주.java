package com.example.tdd_prac;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();

        for(int i=0;i<players.length;i++){
            map.put(players[i],i+1);
            map2.put(i+1,players[i]);
        }
        String target = "";
        int rank = 0;
        for (String call : callings) {

            rank = map.get(call);
            target = map2.get(rank - 1);

            map.put(call, rank - 1);
            map.put(target, rank);

            map2.put(rank - 1, call);
            map2.put(rank, target);
        }
        System.out.println(map);
        System.out.println(map2);

        int idx=0;
        for (int key : map2.keySet()) {
            answer[idx++] = map2.get(key);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] b = {"kai", "kai", "mine", "mine"};
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.solution(a, b)));
    }

}
