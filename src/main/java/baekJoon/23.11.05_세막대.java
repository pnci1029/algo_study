package com.example.tdd_prac;

import java.util.*;

/**
 2 2 2
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        Collections.sort(arr);
        int max = arr.get(2);
        int middle = arr.get(1);
        int min = arr.get(0);

        if (max >= min + middle) {
            System.out.println(middle + min + middle + min - 1);
        } else {
            System.out.println(max + min + middle);
        }
    }
}

