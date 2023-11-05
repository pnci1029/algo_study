package com.example.tdd_prac;

import java.util.*;

/**
 5
 5
 2
 3
 4
 1
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(in.nextInt());
        }
        Collections.sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

    }
}

