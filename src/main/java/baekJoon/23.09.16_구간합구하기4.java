package com.example.tdd_prac;

import java.util.*;

/**
 *
 5 3
 5 4 3 2 1
 1 3
 2 4
 5 5
 */


public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int answerLength = in.nextInt();
        int[] box = new int[length+1];
        for (int i = 1; i < box.length; i++) {
            box[i] = box[i-1] + in.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answerLength; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            int endIdx = Math.max(start, end);
            int startIdx = Math.min(start, end);
            sb.append(box[endIdx] - box[startIdx - 1]).append("\n");

        }
        System.out.println(sb);

    }

}

