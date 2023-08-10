package com.example.tdd_prac;

import java.util.*;

/**
 * 3 2
 */

public class BackJoon {

    private static int N = 0;
    private static int K = 0;
    private static int[] arr = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = in.nextInt();
        int length = in.nextInt();

        LinkedHashSet<String> box = new LinkedHashSet<>();

        for (int i = 0; i < length; i++) {
            String value = in.next();

            if (box.contains(value)) {
                box.remove(value);
                box.add(value);
            } else {
                box.add(value);
            }
//            System.out.println(box);
        }
        int count = 0;
        for (String s : box) {
            if (count == total) {
                break;
            }else{

            System.out.println(s);}
            count++;
        }

//        Map<String, Integer> map = new HashMap<>();
//        List<String> arr = new ArrayList<>(map.keySet());
//
//        for (int i = 0; i < length; i++) {
//            arr.add(in.next());
//        }
//        int count = 1;
//        for (int i = 0; i < arr.size(); i++) {
//            if (map.containsKey(arr.get(i))) {
//                count++;
//                map.put(arr.get(i), count);
//            } else {
//                map.put(arr.get(i), count);
//            }
//            count++;
//        }
////      오름차순
//        arr.sort(((o1, o2) -> map.get(o1).compareTo(map.get(o2))));
//        List<String> result = new ArrayList<>();
//
//        if (total >= length) {
////            System.out.println(map);
////            System.out.println(arr);
//
//            for (String s : arr) {
//                if (!result.contains(s)) {
//                    result.add(s);
//                }
//            }
//            for (String s : result) {
//                System.out.println(s);
//            }
//        } else {
////        Map<String, Integer> result = new HashMap<>();
//            for (int i = 0; i <= total; i++) {
//                if (result.size() == total) {
//                    break;
//                }
//                if (!result.contains(arr.get(i))) {
//                    result.add(arr.get(i));
//                }
//            }
////        System.out.println("result = " + result);
////        System.out.println("arr = " + arr);
////        System.out.println(map);
//
//            for (String s : result) {
//                System.out.println(s);
//            }
////        for (String s : map.keySet()) {
////            if (result.contains(s)) {
////                System.out.println(s);
////            }
////        }
//
//        }



    }

}
