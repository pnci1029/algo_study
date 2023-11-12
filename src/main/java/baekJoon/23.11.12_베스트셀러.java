package com.example.tdd_prac;

import java.util.*;

/**
 8
 icecream
 peanuts
 peanuts
 chocolate
 candy
 chocolate
 icecream
 apple
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        for (int i = 0; i < length; i++) {

            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
            max = Math.max(max, map.get(value));
        }
//        System.out.println(max);
//        System.out.println(map);

        List<String> result = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                result.add(s);
            }
        }
        Collections.sort(result);
        System.out.println(result.get(0));

    }
}

