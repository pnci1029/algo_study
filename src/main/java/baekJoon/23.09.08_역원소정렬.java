package com.example.tdd_prac;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 10 5 2233
 1601 90100 13009 802
 50000000
 301 7654321
 210
 */


public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String value = in.next();
            StringBuilder sb = new StringBuilder(value).reverse();

            arr.add(Long.parseLong(sb.toString()));
        }
        Collections.sort(arr);
        for (Long integer : arr) {
            System.out.println(integer);
        }
    }
}
