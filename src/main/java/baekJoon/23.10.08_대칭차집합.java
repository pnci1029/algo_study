package com.example.tdd_prac;

import java.util.*;

/**
 3 5
 1 2 4
 2 3 4 5 6
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthA = in.nextInt();
        int lengthB = in.nextInt();

        Map<Long, Long> mapA = new HashMap<>();
        Map<Long, Long> mapB = new HashMap<>();

        for (int i = 0; i < lengthA; i++) {
            mapA.put((long) in.nextInt(), 0L);
        }

        for (int i = 0; i < lengthB; i++) {
            mapB.put((long) in.nextInt(), 0L);
        }
        long countA = 0;
        long countB = 0;
        for (Long a : mapA.keySet()) {
            if (!mapB.containsKey(a)) {
                countA++;
            }
        }
        for (Long b : mapB.keySet()) {
            if (!mapA.containsKey(b)) {
                countB++;
            }
        }

        System.out.println(countA+countB);
    }
}

