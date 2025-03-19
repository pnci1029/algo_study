v1 NOT SOLVED
package com.example.vargenerator.api.controller;

import java.util.*;

/**
 8 8
 WBWBWBWB
 BWBWBWBW
 WBWBWBWB
 BWBBBWBW
 WBWBWBWB
 BWBWBWBW
 WBWBWBWB
 BWBWBWBW


 10 13
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 BBBBBBBBWBWBW
 BBBBBBBBBWBWB
 WWWWWWWWWWBWB
 WWWWWWWWWWBWB

 9 23
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBB
 BBBBBBBBBBBBBBBBBBBBBBW
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalCount = 0;
        int result = Integer.MAX_VALUE;

        int column = scanner.nextInt();
        int row = scanner.nextInt();

        char [][] box = new char[column][row];


        for(int i =0; i< column; i++){
            box[i] = scanner.next().toCharArray();
        }

        int xStart = 0;
        int xEnd = 8;
        int yStart = 1;
        int yEnd = 8;

        while(yEnd <= row){
            for(int i =xStart; i< xEnd; i++){
                char rowFirst = box[i][0];
                for(int j =yStart; j< yEnd; j++){
                    if(rowFirst == box[i][j]){
                        box[i][j] = changeValue(box[i][j]);
                        totalCount++;
                    }
                    rowFirst = box[i][j];
                }
            }
            if(xEnd == column){
                xStart = 0;
                xEnd = 8;
                yStart++;
                yEnd++;
            }
            xStart++;
            xEnd++;
            result = Math.min(result, totalCount);

        }
        System.out.println("result = " + result);


    }


    public static char changeValue(char value) {
        if (value == 'B') {
            return 'W';
        }else  {
            return 'B';
        }
    }
}
