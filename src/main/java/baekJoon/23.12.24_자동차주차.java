package com.example.tdd_prac;

import java.util.*;

/**
 7 2 2 3

 */

public class BackJoon {

    private static int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    private static int countParkingCombinations(int N, int A, int B, int C) {
        return combination(N, A) * combination(N - A, B) * combination(N - A - B, C);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int result = countParkingCombinations(length, A, B, C);
        System.out.println(result);

    }
}

