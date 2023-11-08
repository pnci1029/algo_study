package com.example.tdd_prac;

import java.util.*;

/**
 2 7
 3 5

 1 16
 1 24

 1 4
 1 8

 2 4
 1 3

4 4
 4 4
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int min = Math.min(b, d);
        int divide = 0;
        for (int i = min; i >= 1; i--) {
            if (b % i == 0 && d % i == 0) {
                divide = i;
                break;
            }
        }
        System.out.println("divide = " + divide);
        if (divide == 1) {
            System.out.println(a * d + c * b);
            System.out.println(b * d);
        } else {
            System.out.println("divide = " + divide);
            int targetA = b / divide;
            int targetB = d / divide;
            int upper = targetB * a + targetA * c;
            int lower = b * targetB;

            

            System.out.println(upper);
            System.out.println(lower);
//            System.out.println(targetA);
//            System.out.println(targetB);

        }

    }
}

