package com.example.tdd_prac;

import java.util.*;

/**
 1
 10
 13
 100
 1000
 10000
 100000
 0
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        boolean[] box = new boolean[123457*2];

        while (true) {
            int value = in.nextInt();
            if (value == 0) {
                break;
            } else {
                arr.add(value);
            }
        }
        for (int i = 2; i < box.length; i++) {

            for (int j = 2; j <= box.length/i; j++) {
                if (i * j < box.length) {
                    box[i * j] = true;
                }
            }
        }
//        for (int i = 1; i < 100; i++) {
//            System.out.println(box[i]);
//        }

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            int count = 0;
            for (int j = value*2; j > value; j--) {
                if (!box[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }



    }
}

