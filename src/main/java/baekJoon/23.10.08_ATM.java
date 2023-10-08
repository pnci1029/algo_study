package com.example.tdd_prac;

import java.util.*;

/**
 5
 3 1 4 3 2
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] box = new int[length];
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            box[i] = in.nextInt();
        }
        Arrays.sort(box);
        System.out.println(Arrays.toString(box));

        int target = 0;
        for (int i = 0; i < length; i++) {
            target += box[i];
            result[i] = target;
        }
        System.out.println(Arrays.toString(result));
        int count = 0;
        for (int i : result) {
            count += i;
        }
        System.out.println(count);
    }
}

