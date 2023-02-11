package com.example.tdd_prac;

import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        long num = 1;
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            num *= i;
        }
        System.out.println("list = " + list);
        k--;
        while (idx < answer.length) {
            num /= (n--);
            int i = (int) (k / num);
            answer[idx++] = list.get(i);
            list.remove(i);
            System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
            System.out.println("list = " + list);
            k %= num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.solution(3, 5)));
    }

}
