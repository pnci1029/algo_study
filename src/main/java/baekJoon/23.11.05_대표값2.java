package com.example.tdd_prac;

import java.util.*;

/**
 10
 40
 30
 60
 30

 3 4 5 1 2
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] box = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            box[i] = in.nextInt();
            sum += box[i];
        }

        Arrays.sort(box);
        int middle = box[2];
        System.out.println(sum / 5);
        System.out.println(middle);




    }
}

