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
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            System.out.println(nCrCalculate(first, second));
        }

    }

    // nCr = n!/r!(n - r)!                  5       2
    private static long nCrCalculate(int first, int second) {
        if ( first == second) {
            return 1;
        }

        /**
         * 5! / 2! * 3!
         */

        long result = 1;
        for (int i = 1; i <= first; i++) {
            result *= second--;
            result /= i;
        }
        return result;
    }
}
