package com.example.tdd_prac;

import java.util.*;

/**
 5
 4 1 5 2 3
 5
 1 3 7 9 5
 */

public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            map.put(value, 0);
        }
        length = in.nextInt();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            arr.add(value);
        }
//        System.out.println(arr);
//        System.out.println(map);
        for (Integer integer : arr) {
            if (map.containsKey(integer)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

}

