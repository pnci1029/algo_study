package com.example.tdd_prac;

import java.util.*;

/**
 3
 3
 10 7 6
 3
 3 5 9
 5
 1 1 3 1 2

 10
 3
 3 6 1
 3
 6 7 5
 4
 6 4 7 2
 5
 9 3 10 9 5
 4
 6 9 8 5
 3
 4 10 1
 4
 6 9 2 2
 5
 5 7 7 8 5
 3
 7 8 4
 5
 7 6 9 1 6
 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int totalLength = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalLength; i++) {
            int length = in.nextInt();
            long[] arr = new long[length];

            for (int j = 0; j < length; j++) {
                arr[j] = in.nextLong();
            }

            long profit = 0;
            long maxPrice = 0;

            for (int j = length - 1; j >= 0; j--) {
                if (arr[j] > maxPrice) {
                    maxPrice = arr[j];
                } else {
                    profit += maxPrice - arr[j];
                }
            }

            sb.append(profit).append("\n");
        }

        System.out.println(sb.toString());

//        Scanner in = new Scanner(System.in);
//
//        int totalLength = in.nextInt();
//        StringBuilder sb = new StringBuilder();
//        List<Long> result = new ArrayList<>();
//
//        for (int i = 0; i < totalLength; i++) {
//            int length = in.nextInt();
//            long[] arr = new long[length];
//
//            long score = 0;
//
//            List<Long> box = new ArrayList<>();
//            List<Long> tempBox = new ArrayList<>();
//            long max =0;
//            long idx = 0;
//            for (int j = 0; j < length; j++) {
//                int value = in.nextInt();
//                arr[j] = value;
//                max = Math.max(max, value);
//                if (max == value) {
//                    idx = j;
//                }
//            }
//
//            for (int k = 0; k < length-1; k++) {
//                if (arr[k] < max && k < idx) {
//                    box.add(arr[k]);
//                } else if (arr[k] < arr[k + 1]) {
//                    if (!tempBox.isEmpty()) {
//                        box.addAll(tempBox);
//                        tempBox.clear();
//                    }
//                    box.add(arr[k]);
//                } else if (arr[k] == arr[k + 1]) {
//                    tempBox.add(arr[k]);
//                } else {
//                    tempBox.clear();
//                    if (!box.isEmpty()) {
//                        for (Long integer : box) {
//                            score += arr[k]-integer;
//                        }
//                    }
//                    box.clear();
//                }
//
//                if (k == length - 2) {
//                    if (!box.isEmpty()) {
//                        for (Long integer : box) {
//                            score += arr[k+1]-integer;
//                        }
//                    }
//                }
//            }
//            result.add(score);
//        }
//        for (Long aLong : result) {
//            System.out.println(aLong);
//        }
    }
}

