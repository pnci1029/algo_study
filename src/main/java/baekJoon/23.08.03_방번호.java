package com.example.tdd_prac;

import java.util.*;

/**
 * 150
 * 266
 * 427
 */
public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] value = in.next().split("");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }


        for (String s : value) {
            if (s.equals("6") || s.equals("9")) {
                if (map.get(6) > map.get(9)) {
                    map.put(9, map.get(9) + 1);
                } else {
                    map.put(6, map.get(6) + 1);
                }
            } else {
                map.put(Integer.parseInt(s), map.get(Integer.parseInt(s)) + 1);
            }
        }

        int result = 0;
        for (Integer integer : map.values()) {
            if (integer >= result) {
                result = integer;
            }
        }
        System.out.println(result);


    }

}
