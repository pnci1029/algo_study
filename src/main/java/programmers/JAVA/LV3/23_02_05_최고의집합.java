package com.example.tdd_prac;

import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        List<Integer> answer = new ArrayList<>();

        int[] result = new int[n];
        if (n > s) {
            return new int[]{-1};
        }else {
        if (s % n == 0) {
            for (int i = 0; i < n; i++) {
                result[i] = s / n;
            }
        } else {
            int nam = s % n;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (count < nam) {
                    result[i] = s / n+1;
                    count++;
                }else
                    result[i] = s / n;
//                if ((i + 1) % 2 == 0) {
//                    result[i] = s / n+1;
//                } else {
//                    result[i] = s / n;
//                }
            }
        }
        int sum = 0;
        for (int i : result) {
            sum += i;
        }
        Arrays.sort(result);

        return result;

        }
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        Solution solution = new Solution();
        int[] solution1 = solution.solution(a, b);
        System.out.println("solution1 = " + Arrays.toString(solution1));
    }
}

