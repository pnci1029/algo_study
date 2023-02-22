package com.example.tdd_prac;

import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        int[] board = new int[4001];

        for(int weight : weights){
            if(board[weight]!=0){
                answer+=board[weight];
            }
            if(weight*2<=1000&&board[weight*2]!=0){
                answer+=board[weight*2];
            }
            if(weight%2==0&&weight/2>=100&&board[weight/2]!=0){
                answer+=board[weight/2];
            }
            if(weight%2==0&&(weight/2)*3<=1000&&board[(weight/2)*3]!=0){
                answer+=board[(weight/2)*3];
            }
            if(weight%3==0&&(weight/3)*2>=100&&board[(weight/3)*2]!=0){
                answer+=board[(weight/3)*2];
            }
            if(weight%3==0&&(weight/3)*4<=1000&&board[(weight/3)*4]!=0){
                answer+=board[(weight/3)*4];
            }
            if(weight%4==0&&(weight/4)*3>=100&&board[(weight/4)*3]!=0){
                answer+=board[(weight/4)*3];
            }

            board[weight]++;
        }

        return answer;
    }

    /*
        2, 3, 4
     */

    public static void main(String[] args) {
        int[] box = {100, 180, 360, 100, 270};
        Solution solution = new Solution();
        long solution1 = solution.solution(box);
        System.out.println("solution1 = " + solution1);

    }
}
