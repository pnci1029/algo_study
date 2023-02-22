package com.example.spring_prac.app.trace;
class Solution {
    public int solution(int num) {
        int answer = -1;
        long nums = num;
        for (int i = 0; i < 500; i++) {

            answer++;
            if (nums == 1) {
                break;
            }
            if (nums % 2 == 0) {
                nums /= 2;
                continue;
            } else {
                nums = (nums * 3) + 1;
            }
        }

        if (nums != 1) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int abcde = solution.solution(626331);
        System.out.println("abcde = " + abcde);
    }
}
