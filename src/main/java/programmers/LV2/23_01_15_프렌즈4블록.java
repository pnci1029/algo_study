package com.example.tdd_prac;

import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

//        for (String s : board) {
//            System.out.println(s);
//        }

        while (true) {
        int[][] box = new int[m][n];
            int count = 0;
            for (int i = 0; i < board.length-1; i++) {
                String[] targets = board[i].split("");
                String[] targetsNext = board[i+1].split("");
                for (int j = 0; j < targets.length - 1; j++) {
                    if (targets[j].equals(targets[j + 1]) && targetsNext[j].equals(targetsNext[j+1]) && targets[j].equals(targetsNext[j]) &&
                            !targets[j].equals("Z") && !targetsNext[j+1].equals("Z") && !targets[j].equals("Z") && !targetsNext[j].equals("Z")) {
                        box[i][j] = box[i][j+1] = box[i+1][j] = box[i+1][j+1] = 1;
                        count++;
                    }
                }
            }

//            for (int[] ints : box) {
//                System.out.println(Arrays.toString(ints));
//            }
//            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//            for (String s : board) {
//                System.out.println(s);
//            }
//            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            for (int i = 0; i < box.length-1; i++) {
                String[] targets = board[i].split("");
                String[] targetsNext = board[i+1].split("");
                String result = "";
                String resultNext = "";
                for (int j = 0; j < box[i].length; j++) {
                    if (box[i][j] == 0 && box[i + 1][j] == 1) {
                        box[i][j] = 1;
                        box[i + 1][j] = 0;
                        targetsNext[j] = targets[j];
                        resultNext += targets[j];

                        targets[j] = "Z";
                        result += "Z";
//                        System.out.println(i);
//                        System.out.println("j = " + j);
                    } else {
                        resultNext += targetsNext[j];
                        result += targets[j];
                    }
                }
                board[i] = result;
                board[i + 1] = resultNext;
            }



//            for (int[] ints : box) {
//                System.out.println(Arrays.toString(ints));
//            }
//            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//            for (String s : board) {
//                System.out.println(s);
//            }

            for (int i = 0; i < board.length-1; i++) {
                String[] targets = board[i].split("");
                String[] targetsNext = board[i+1].split("");
                String result = "";
                String resultNext = "";
                for (int j = 0; j < targets.length; j++) {
                    if (!targets[j].equals("Z") && targetsNext[j].equals("Z")) {
                        targetsNext[j] = targets[j];
                        resultNext += targetsNext[j];

                        targets[j] = "Z";
                        result += targets[j];
                    } else {
                        resultNext += targetsNext[j];
                        result += targets[j];
                    }
                }
                board[i] = result;
                board[i + 1] = resultNext;
            }

//            for (int[] ints : box) {
//                System.out.println(Arrays.toString(ints));
//            }
//            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//            System.out.println("한바퀴끝");
//            for (String s : board) {
//                System.out.println(s);
//            }

            if (count == 0) {
            break;

            }
        }
        for (int i = 0; i < board.length; i++) {
            String[] target = board[i].split("");
            for (String s : target) {
                if (s.equals("Z")) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int b = 4;
        int c = 5;
        String[] a = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
//        int b = 6;
//        int c = 6;
//        String[] a = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int solution1 = solution.solution(b,c,a);
        System.out.println(solution1);

    }
}
