package baekJoon.hash;

import java.util.*;

/**
 12
 bnb2011 chansol
 chansol chogahui05
 chogahui05 jthis
 jthis ChongChong
 jthis jyheo98
 jyheo98 lms0806
 lms0806 pichulia
 pichulia pjshwa
 pjshwa r4pidstart
 r4pidstart swoon
 swoon tony9402
 tony9402 bnb2011
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            String first = in.next();
            String second = in.next();

            if (first.equals("ChongChong") || second.equals("ChongChong")){
                map.put(first,0);
                map.put(second,0);
            }
            if (map.containsKey(first)) {
                map.put(second,0);
            }
            if (map.containsKey(second)) {
                map.put(first, 0);
            }
        }
//        System.out.println(map);
        System.out.println(map.size());


    }
}

