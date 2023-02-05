package com.example.tdd_prac;

import java.util.*;
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] box = new int[101];

        box[0] = 0;
        box[1] = 1;
        for (int i = 2; i <= 100; i++) {
            box[i] = box[i - 1]+1;
            if (box[i] % 3 == 0) {
                box[i]++;
            }
            if (box[i] >= 10 && box[i] % 10 == 3) {
                box[i]++;
            }
            if (box[i] % 3 == 0) {
                box[i]++;
            }
            if (box[i] >= 10 && box[i] / 10 == 3) {
                while (true) {
                    box[i]++;
                    if(box[i] >= 40) {
                        break;
                    }
                }
            }else if (box[i] >= 100 && box[i] / 10 % 10 == 3) {
                while (true) {
                    box[i]++;
                    if (box[i] >= 100 && box[i] >= 140) {
                        break;
                    }
                }
            }
        }
//        System.out.println("box[4] = " + box[4]);
//        System.out.println("box[9] = " + box[9]);
//        System.out.println("box[10] = " + box[10]);
//        System.out.println("box[15] = " + box[15]);
//        System.out.println("box[40] = " + box[40]);
//        for(int i =1; i<=100; i++){
//            int numb = 1;
//            if((box[i-1]+1)%3==0){
////                if (box[i - 1] >= 10 ) {
//                if (box[i - 1] >= 10 && (box[i - 1] % 3 == 0)) {
//                    box[i] = box[i - 1] + 2 + numb;
//                } else {
//                    box[i] = box[i - 1] + 1 + numb;
//                }
//            }else{
//                if ((box[i - 1]+1) % 10 == 3 && box[i - 1] >= 10) {
//                    box[i] = box[i - 1] + 1;
//                    System.out.println("box[i-1] = " + box[i - 1]);
//                } else {
//                    box[i] = box[i - 1] + 1;
//
//                }
//            }
//        }

        return box[n];
    }

    public static void main(String[] args) {

        int a = 100;
        Solution solution = new Solution();
        int solution1 = solution.solution(a);
        System.out.println("solution1 = " + solution1);
    }
}

