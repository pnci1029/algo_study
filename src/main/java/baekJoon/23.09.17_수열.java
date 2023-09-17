package com.example.tdd_prac;

import java.util.*;

/**
 *
 10 5
 3 -2 -4 -9 0 3 7 13 8 -3
 */

public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int scope = in.nextInt();

        int[] box = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            int value = in.nextInt();
            box[i] = box[i-1] +value;
        }

        int max = -10000001;
        for (int i = scope; i <= length; i++) {
            int result = box[i] - box[i-scope];

            if (max < result) {
                max = result;

            }
        }
        System.out.println(max);

        System.out.println(Arrays.toString(box));

//        for (int i = 0; i < length; i++) {
//            int start = i;
//            int end = i;
//        }


//        if (Math.sqrt(length) < 317) {
//            for (int i = 0; i < length; i++) {
//                if (i + scope > box.length) {
//                    break;
//                }
//                int value = 0;
//                for (int j = i; j < i + scope; j++) {
//                    value += box[j];
//                }
//                arr.add(value);
//
//            }
//            Collections.sort(arr);
//            System.out.println(arr.get(arr.size() - 1));
//        }


    }

}

