package com.example.tdd_prac;

import java.util.*;

/**
 9
 5 12 7 10 9 1 2 3 11
 13
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] box = new int[length];
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            box[i] = value;
        }

        Arrays.sort(box);
        int target = in.nextInt();
        int start = 0;
        int end = box.length-1;
        int result = 0;
        while (start<end) {
        int sum = box[start] + box[end];
            if (target == sum) {
                result++;
            }
            if(sum <= target) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(result);

    }
}

