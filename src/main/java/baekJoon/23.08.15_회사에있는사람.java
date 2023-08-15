package com.example.tdd_prac;

import java.util.*;

/**
 * 4
 * a a
 5
 Baha enter
 baha enter
 Askar enter
 Baha leave
 Artem enter
 */

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            String name = in.next();
            String status = in.next();

//            if (!map.containsKey(name)) {
                map.put(name, status);
//            } else if (status.equals("leave")) {
//                map.put(name, status);
//            }

        }
        List<String> arr = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s).equals("enter")) {
                arr.add(s);
            }
        }

        arr.sort(Collections.reverseOrder());
        for (String s : arr) {
            System.out.println(s);
        }

    }



}
