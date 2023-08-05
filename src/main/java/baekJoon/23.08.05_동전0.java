package com.example.tdd_prac;

import java.util.*;

/**
 * 10 4200
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 */

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int max = in.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

//            System.out.println("count = " + count);
//            System.out.println("max = " + max);

            if (arr[i] <= max) {
                count += (max / arr[i]);
                max = max % arr[i];
            }
        }
        System.out.println(count);

    }

}
