package com.example.tdd_prac;

import java.util.*;

/**
 *
 baekjoon

 */


public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String value = in.next();
        int length = value.length();

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(value);
            value = value.substring(1);
        }
        Collections.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }


    }

}

