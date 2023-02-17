package com.example.tdd_prac;

import java.util.*;

class Solution {
    public List<Integer> solution(int[] numlist, int n) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numlist) {
            map.put(i, Math.abs(n - i));
        }
        List<Integer> keySet = new ArrayList<Integer>(map.keySet());

        Collections.sort(keySet);
        System.out.println("map = " + map);
        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        List<Integer> box = new ArrayList<>();
        for (int i = keySet.size() - 1; i >= 0; i--) {
            box.add(keySet.get(i));
        }


        return box;
    }
    public static void main(String[] args) {
        int []a = {600, 400, 300, 200, 700, 800, 100, 900};
        int b= 500;
        Solution solution2 = new Solution();
        System.out.println(solution2.solution(a,b));
    }

}
