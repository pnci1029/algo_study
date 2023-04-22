package com.example.tdd_prac;

import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        String[] split = code.split("");
        int mode = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("1") && mode ==1) {
                mode = 0;
            } else if (split[i].equals("1") && mode == 0) {
                mode = 1;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    answer += split[i];
                } else if (mode == 1 && i % 2 != 0) {
                    answer += split[i];
                }
            }

        }
        if (answer.length() == 0) {
            return "EMPTY";
        }


        return answer;
    }

    public static void main(String[] args) {

        String a = "abc1abc1abc";
        Solution solution2 = new Solution();

        System.out.println(solution2.solution(a));
    }

}
