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
                            !targets[j].equals("#") && !targetsNext[j+1].equals("#") && !targets[j].equals("#") && !targetsNext[j].equals("#")) {
                        box[i][j] = box[i][j+1] = box[i+1][j] = box[i+1][j+1] = 1;
                        count++;
                    }
                }
            }

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            for (String s : board) {
                System.out.println(s);
            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("box1");
            for (int[] ints : box) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            /**
             * 백업
             */
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

                        targets[j] = "#";
                        result += "#";
//                        System.out.println(i);
//                        System.out.println("j = " + j);
                    } else if (box[i][j] == 1 && box[i + 1][j] == 1) {
                        targetsNext[j] = "#";
                        targets[j] = "#";

                        resultNext += "#";
                        result += "#";
                    } else {
                        resultNext += targetsNext[j];
                        result += targets[j];
                    }
                }
                board[i] = result;
                board[i + 1] = resultNext;
            }


            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

            System.out.println("box222");

            for (int[] ints : box) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            for (String s : board) {
                System.out.println(s);
            }

            for (int i = 0; i < board.length-1; i++) {
                int numb = 0;
                String[] targets = board[i].split("");
                String[] targetsNext = board[i+1].split("");
                String result = "";
                String resultNext = "";
                for (int j = 0; j < targets.length; j++) {
                    if (!targets[j].equals("#") && targetsNext[j].equals("#")) {
                        targetsNext[j] = targets[j];
                        resultNext += targetsNext[j];

                        targets[j] = "#";
                        result += targets[j];
                        numb++;
                    } else {
                        resultNext += targetsNext[j];
                        result += targets[j];
                    }
                }
                board[i] = result;
                board[i + 1] = resultNext;
            }

//                for (int i = board.length-1; i >0; i--) {
//                int numb = 0;
//                String[] targets = board[i].split("");
//                String[] targetsNext = board[i-1].split("");
//                String result = "";
//                String resultNext = "";
//                for (int j = 0; j < targets.length; j++) {
//                    if (!targets[j].equals("#") && targetsNext[j].equals("#")) {
//                        targets[j] = targetsNext[j];
//                        result += targets[j];
//
//                        targetsNext[j] = "#";
//                        resultNext += targetsNext[j];
//                        numb++;
//                    } else {
//                        resultNext += targetsNext[j];
//                        result += targets[j];
//                    }
//                }
//                board[i] = result;
//                board[i -1] = resultNext;
//            }

            System.out.println("한바퀴끝");
            for (int[] ints : box) {
                System.out.println(Arrays.toString(ints));
            }

            if (count == 0) {
                break;

            }
        }
        for (int i = 0; i < board.length; i++) {
            String[] target = board[i].split("");
            for (String s : target) {
                if (s.equals("#")) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int b = 6;
//        int c = 6;
//        String[] a = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
//        int b = 6;
//        int c = 6;
//        String[] a = {"IIIIOO", "IIIOOO", "IIIOOI", "IOOIII", "OOOIII", "OOIIII"};
//        int b = 3;
//        int c =6;
//        String[] a = {"AAAAAB", "AAAAAB","AAABBB"};
//        int b = 4;
//        int c = 5;
//        String[] a = {"CCBDE", "AAADE", "AAAAF", "CCAAF"};

        String[] a = {"HGNHU", "CRSHV", "UKHVL", "MJHQB", "GSHOT", "MQMJJ", "AGJKK", "QULKK"};
        int b = 8;
        int c= 5;
        int solution1 = solution.solution(b,c,a);
        System.out.println(solution1);

    }
}
