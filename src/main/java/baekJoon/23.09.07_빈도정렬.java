package com.example.tdd_prac;

import java.util.*;

/**
 *
 9 77
 11 33 11 77 54 11 25 25 33
 */


public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int asdadsdasd = in.nextInt();
        List<Integer> box = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            box.add(value);
            arr.add(value);
            map.put(value, map.getOrDefault(value, 0) + 1);
        }


        Collections.sort(box, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
//                return map.get(o1) - map.get(o2);
//                return Integer.compare(o2, o1);
                return arr.indexOf(o1) - arr.indexOf(o2);
            }
            return Integer.compare(map.get(o2), map.get(o1));
        });

        StringBuilder sb = new StringBuilder();
        for (Integer integer : box) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb);

    }
}
