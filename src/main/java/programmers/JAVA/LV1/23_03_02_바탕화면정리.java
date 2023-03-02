package com.example.tdd_prac;


import java.util.Arrays;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int lux = 51;
        int luy = 51;
        int rdx = 0;
        int rdy = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            String[] split = wallpaper[i].split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("#")) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;

//        System.out.println("lux = " + lux);
//        System.out.println("luy = " + luy);
//        System.out.println("rdx = " + rdx);
//        System.out.println("rdy = " + rdy);

        return answer;
    }

    public static void main(String[] args) {

//        String[] a = {".#...", "..#..", "...#."};
        String[] a = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.solution(a)));
    }

}
