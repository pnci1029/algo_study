package com.example.tdd_prac;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 5
 3 4
 1 1
 1 -1
 2 2
 3 3
 */


public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[][] box = new int[length][2];
        for (int i = 0; i < length; i++) {
            int value1 = in.nextInt();
            int value2 = in.nextInt();
            box[i][0] = value1;
            box[i][1] = value2;
        }

        Arrays.sort(box,((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
//            if (o1[0] == o2[0]) {
//                return o2 - o1;
//            }
        }));

        StringBuilder sb = new StringBuilder();

        for (int[] ints : box) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }
        System.out.println(sb);

    }
}
