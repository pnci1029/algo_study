package com.example.tdd_prac;


import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int[][] box = new int[land.length][land[0].length];

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                box[i][j] = land[i][j];
            }
        }

        for(int i = 1; i < land.length;i++){
            box[i][0] += Math.max(land[i-1][3], Math.max(land[i-1][1], land[i-1][2]));
            box[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][3], land[i-1][2]));
            box[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            box[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));

            land[i][0] = box[i][0];
            land[i][1] = box[i][1];
            land[i][2] = box[i][2];
            land[i][3] = box[i][3];

        }


        return Math.max(Math.max(box[box.length-1][0],box[box.length-1][1]),Math.max(box[box.length-1][2],box[box.length-1][3]));
    }

    public static void main(String[] args) {

//        int [][]a = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
//        int [][]a = {{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}};
        int[][] a = {{1, 1, 1, 1}, {2, 2, 2, 3}, {3, 3, 3, 6}, {4, 4, 4, 7}};
        Solution solution2 = new Solution();
        System.out.println("solution2 = " + solution2.solution(a));;
    }

}
