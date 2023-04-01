package com.example.tdd_prac;

import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;


        int[][] box = new int[10][10];
        String[] split = dirs.split("");
        int width = 5;
        int height = 5;
        box[width][height] += 1;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("U")) {
                height += 1;
                if (height >= 10) {
                    height -= 1;
                }
                box[width][height] += 1;
            } else if(split[i].equals("D")) {
                height -= 1;
                if (height < 1) {
                    height++;
                }
                box[width][height] += 1;
            } else if(split[i].equals("L")) {
                width -= 1;
                if (width < 1) {
                    width++;
                }
                box[width][height] += 1;
            } else if(split[i].equals("R")) {
                width += 1;
                if (width >= 10) {
                    width -= 1;
                }
                box[width][height] += 1;
            }
        }


        for (int[] ints : box) {
            System.out.println(Arrays.toString(ints));
            for (int anInt : ints) {
                if (anInt > 0) {
                    answer++;
                }
            }
        }
        if (answer <= 3) {
            answer--;
        }


        return answer;
    }

    public static void main(String[] args) {

//        String a = "ULURRDLLU";
//        String a = "RRRRRRRRRRRRRRRRRRRRRUUUUUUUUUUUUULU";
        String a = "LURDLURDLURDLURDRULD";
//        String a = "LLLLRLRLRLL";
//        String a = "UUUUDUDUDUUU";
//        String a = "UDDUUD";
        Solution solution2 = new Solution();
        System.out.println(solution2.solution(a));
    }

}
