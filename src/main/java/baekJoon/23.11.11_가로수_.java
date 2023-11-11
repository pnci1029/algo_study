package com.example.tdd_prac;

import java.util.*;

/**
 4
 1
 3
 7
 13

 4
 2
 6
 12
 18

 5
 1
 4
 11
 19
 28

 3
 1
 50001
 100001

 3
 2
 4
 6

 2
 1000000000
 900000000
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        Set<Integer> numberBox = new HashSet<>();
        int lastCount = 0;
        int[] box = new int[length];

        for (int i = 0; i < length; i++) {
            box[i] = in.nextInt();
            if (i == length - 1) {
                lastCount = box[i];
            }
        }

        int min = 999999999;
        for (int i = 0; i < box.length - 1; i++) {
            min = Math.min(min, box[i + 1] - box[i]);
            numberBox.add(box[i+1]-box[i]);
        }

        int result = 0;
        for (int i = min; i >= 1; i--) {
            int count = 0;
            for (Integer integer : numberBox) {
                if (integer % i == 0) {
                    count++;
                }
            }
            if (count == numberBox.size()) {
                result = i;
                break;
            }
        }

        if (result != 0) {
            if ((Math.round(((double) lastCount / result))) == box.length) {
                System.out.println(0);
            } else {
                System.out.println((int)(Math.ceil(((double) lastCount / result))) - box.length);
            }
        } else {
            System.out.println(lastCount - box.length);
        }
    }
}

