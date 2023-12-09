package com.example.tdd_prac;

import java.util.*;

/**
11 12 2 24 10
16 1 13 3 25
6 20 5 21 17
19 4 8 14 9
22 15 7 23 18
5 10 7 16 2
4 22 8 17 13
3 18 1 6 25
12 19 23 14 21
11 24 9 20 15
         *
14 12 5 11 13
9 4 3 8 25
18 15 19 24 20
1 6 7 23 17
22 16 10 2 21
17 11 9 24 6
23 1 2 15 12
8 14 21 10 16
3 22 18 13 25
4 5 19 7 20

 9 10 1 11 12
 13 14 2 15 16
 3 4 17 5 6
 18 19 7 20 21
 22 23 8 24 25
 1 2 3 4 5
 6 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 */

public class BackJoon {

    static int[][] box;
    static int result;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        box = new int[5][5];
        result = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = in.nextInt();
            }
        }


        int resultCount = 0;
        boolean check = false;
        for (int i = 0; i < 25; i++) {
            resultCount++;
            int value = in.nextInt();
//            result++;

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < 5; k++) {
                    if (box[j][k] == value) {
                        box[j][k] = 0;
                    }
                }
                columnCount();
                rowCount();
                etc();

                if (result >= 3) {
                    check = true;
                    break;
                } else {
                    result = 0;
                }
            }
            if (check) {
                break;
            }
        }

        System.out.println(resultCount);

    }

    public static void rowCount() {
        for (int i = 0; i < 5; i++) {
            int count =0;
            for (int j = 0; j < 5; j++) {
                if (box[i][j] == 0) {
                    count++;
                }
                if (count == 5) {
                    result++;
                }
            }
        }
    }

    public static void columnCount() {
        for (int i = 0; i < 5; i++) {
            int count =0;
            for (int j = 0; j < 5; j++) {
                if (box[j][i] == 0) {
                    count++;
                }
                if (count == 5) {
                    result++;
                }
            }
        }
    }

    public static void etc() {
        if (box[0][0] == 0 && box[1][1] == 0 && box[2][2] == 0 && box[3][3] == 0 && box[4][4] == 0) {
            result++;
        }

        if (box[4][0] == 0 && box[3][1] == 0 && box[2][2] == 0 && box[1][3] == 0 && box[0][4] == 0) {
            result++;
        }
    }
}

