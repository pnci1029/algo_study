package com.example.vargenerator.api.controller;

import java.util.Scanner;

/**
 3
 2 2
 1 5
 13 29
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            long first = scanner.nextInt();
            long second = scanner.nextInt();

            long max = Math.max(first, second);
            long min = Math.min(first, second);

            long parent = max;
            long child = min;
            while (true) {
                if (min <= 1) {
                    break;
                }
                parent *= max - 1;
                child *= min - 1;
                max--;
                min--;
            }


            System.out.println(parent/child);

        }



    }
}
