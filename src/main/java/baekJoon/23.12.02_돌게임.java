package com.example.tdd_prac;

import java.util.*;

/**

 5
 12 7 9 15 5
 13 8 11 19 6
 21 10 26 31 16
 48 14 28 35 25
 52 20 32 41 49

 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        if (length % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }



    }
}

