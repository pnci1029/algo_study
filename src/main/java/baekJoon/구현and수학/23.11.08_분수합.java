package baekJoon.구현and수학;

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
//        if (divide == 1) {
//            System.out.println(a * d + c * b);
//            System.out.println(b * d);
//        } else {
//            System.out.println("divide = " + divide);
////            System.out.println(targetA);
////            System.out.println(targetB);
//
//        }
        int targetA = b / divide;
        int targetB = d / divide;
        int upper = targetB * a + targetA * c;
        int lower = b * targetB;

        int maxA = Math.max(upper, lower);
        int minA = Math.min(upper, lower);
        boolean isHead;

        if (maxA == upper) {
            isHead = true;
        } else {
            isHead = false;
        }

//        System.out.println("maxA = " + maxA);
//        System.out.println("minA = " + minA);
        int result = 0;
        for (int i = minA; i >= 1; i--) {
            if (maxA % i == 0 && minA % i == 0) {
                result = i;
                break;
            }
        }
        if (result != 0) {
            maxA /= result;
            minA /= result;
        }
//        System.out.println("maxA = " + maxA);
//        System.out.println("minA = " + minA);
        if (isHead) {
            System.out.println(maxA);
            System.out.println(minA);
        } else {
            System.out.println(minA);
            System.out.println(maxA);
        }


    }
}

