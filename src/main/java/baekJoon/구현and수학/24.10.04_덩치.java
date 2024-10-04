package com.example.vargenerator.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5
 * 55 185
 * 58 183
 * 88 186
 * 60 175
 * 46 155
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[][] box = new int[length][2];

        for (int i = 0; i < length; i++) {
            int weight = scanner.nextInt();
            int height = scanner.nextInt();

            box[i][0] = weight;
            box[i][1] = height;
        }

        List<Integer> rankBox = new ArrayList<>();
        for (int i = 0; i < box.length; i++) {
            int rank = 1;
            for (int j = 0; j < box.length; j++) {
                if (i == j) {
                    continue;
                }

                if (box[i][0] < box[j][0] && box[i][1] < box[j][1]) {
                    rank++;
                }
            }
            rankBox.add(rank);
        }
        for (Integer i : rankBox) {
            System.out.println(i);
        }

    }
}
