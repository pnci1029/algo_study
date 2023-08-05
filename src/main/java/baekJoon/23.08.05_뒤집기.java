package com.example.tdd_prac;

import java.util.*;


public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String value = in.next();
        String[] split = value.split("");
        int zero =0;
        int one =0;

        if (split[0].equals("0")) {
            zero++;
        } else {
            one++;
        }
        for (int i = 1; i < split.length; i++) {
            if (!split[i].equals(split[i - 1])) {
                if (split[i].equals("1")) {
                    one++;
                } else {
                    zero++;
                }
            }
        }
        System.out.println(Math.min(zero,one));


//        String value = in.next();
//        if (value.length() == 1) {
//            System.out.println(0);
//
//        } else {
//
//        String[] num = value.split("");
//
//
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 0);
//        map.put(1, 0);
//
//        for (int i = 1; i < num.length; i++) {
//            if (i == 1 && !num[i - 1].equals(num[i])) {
//                map.put(Integer.parseInt(num[i - 1]), map.get(Integer.parseInt(num[i - 1])) + 1);
//                map.put(Integer.parseInt(num[i]), map.get(Integer.parseInt(num[i])) + 1);
//            }else if (!num[i - 1].equals(num[i])) {
//                map.put(Integer.parseInt(num[i - 1]), map.get(Integer.parseInt(num[i - 1])) + 1);
//            }
//        }
//        if (!num[num.length - 1].equals(num[num.length - 2])) {
//            map.put(Integer.parseInt(num[num.length - 1]), map.get(Integer.parseInt(num[num.length-1])) + 1);
//        }
//
////        if ((map.get(0) == 0 && map.get(1) == 1) || map.get(0) == 1 && map.get(1) == 0) {
////            System.out.println(1);
////        } else {
////        System.out.println(map);
//            System.out.println(Math.min(map.get(0), map.get(1)));
//        }

//        }
    }

}
