package com.example.tdd_prac;

import java.util.*;

/**
 4 11
 802
 743
 457
 539

 1 3
 3
 */

public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int wish = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            arr.add(value);
        }
        Collections.sort(arr);
        int max = arr.get(arr.size() - 1);
        int min = 1;
        int mid = 0;
        if (arr.size() == 1) {
            System.out.println(wish/arr.get(0));
        } else {
            while (min<max) {

                mid = (max + min) / 2;
                int calculator = 0;
                for (Integer integer : arr) {
                    calculator += integer / mid;
                }
                if (calculator < wish) {
                    max = mid;
                } else {
                    min = mid +1;
                }

            }
            System.out.println(mid);

        }

    }

}

