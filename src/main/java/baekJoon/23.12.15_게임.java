package com.example.tdd_prac;

import java.util.*;

/**
 100 80
 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long x = in.nextInt();
        long y = in.nextInt();
        long initial = (y * 100) / x;
        int result = -1;
//        if (x != y) {
            long left = 1;
            long right = 1000000000;
            while (left <= right) {
                long mid = (left + right) / 2;
                if (((y + mid) * 100 )/ (x+mid) != initial) {
                    result = (int) mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(result);

//        } else {
//            System.out.println("-1");
//        }




    }
}

