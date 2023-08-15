package com.example.tdd_prac;

import java.util.*;

/**
 * 4
 * a a
 10
 1
 2
 1
 2
 1
 2
 3
 3
 3
 3
 */

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            long value = in.nextLong();
            if (!map.containsKey(value)) {
                map.put(value, 1L);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }
        List<Long> arr = new ArrayList<>(map.keySet());

//        arr.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        arr.sort((o1, o2) -> {
            long comp1 = o1;
            long comp2 = o2;
            int compare = Long.compare(map.get(comp2), map.get(comp1));

//            int compareValue = map.get(o2).compareTo(map.get(o1));
            if (compare == 0) {
                return Long.compare(o1, o2);
            } else {
                return compare;
            }
        });


//        System.out.println(arr);
//        System.out.println(map);
        System.out.println(arr.get(0));

    }



}
