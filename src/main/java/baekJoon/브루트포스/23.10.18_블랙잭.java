package baekJoon.브루트포스;

import java.util.*;

/**
 10 500
 93 181 245 214 315 36 185 138 216 295
 */

public class 블랙잭 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int target = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(in.nextInt());
        }
        Collections.sort(arr);
        int result = -5000;
        for (int a = 0; a < arr.size()-2; a++) {
            for (int b = a + 1; b < arr.size() - 1; b++) {
                for (int c = b + 1; c < arr.size(); c++) {
                    if (arr.get(a) + arr.get(b) + arr.get(c) <= target) {
                        result = Math.max(result, arr.get(a) + arr.get(b) + arr.get(c));
                    }
//                    System.out.println(result);
//                    result = Math.min(Math.abs(result), Math.abs(target - (arr.get(a) + arr.get(b) + arr.get(c))));
//                    box.add(arr.get(a) + arr.get(b) + arr.get(c));
                }
            }
        }
        System.out.println(result);
//        int min = -500;
//        int compare = min;
//        int result = 0;
//        Collections.sort(box);
//        for (Integer integer : box) {
//            if (integer <= target) {
//                min = Math.min(Math.abs(min), Math.abs(target - integer));
//                if (min != compare) {
//                    result = integer;
//                    compare = min;
//    //                System.out.println("result = " + result);
//                }
//
//            }
//        }
//        System.out.println(box);
//        System.out.println(result);


    }
}

