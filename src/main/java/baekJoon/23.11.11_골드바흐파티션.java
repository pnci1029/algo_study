package com.example.tdd_prac;

import java.util.*;

/**
 5
 6
 8
 10
 12
 100
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        boolean[] arr = new boolean[1000001];

        int[] box = new int[length];
        for (int i = 0; i < length; i++) {
            box[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(box));

        for (int i = 2; i*i <= arr.length-1; i++) {
            if (!arr[i]) {
                for (int j = i+i; j <= arr.length-1; j+=i) {
                    arr[j] = true;
                }
            }
        }

        for (int i : box) {
            int ans = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (!arr[j] && !arr[i - j]) ans++;
            }
            System.out.println(ans);

        }


    }
}

