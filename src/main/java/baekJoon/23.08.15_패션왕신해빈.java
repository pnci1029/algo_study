package com.example.tdd_prac;

import java.util.*;

/**
 * 4
 2
 3
 hat headgear
 sunglasses eyewear
 turban headgear
 3
 mask face
 sunglasses face
 makeup face
 */

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        for (int i = 0; i < length; i++) {
            int depth2 = in.nextInt();
            Map<String, Integer> map = new HashMap<>();
//            Map<String, Map<String,Integer>> map = new HashMap<>();
            Map<String, Integer> box = new HashMap<>();

           for(int j = 0; j <depth2; j++){
               String item = in.next();
               String parts = in.next();

               if (!map.containsKey(parts)) {
                   map.put(parts, 1);
               } else {
                   map.put(parts, map.get(parts) + 1);
               }
           }



//                if (map.containsKey(parts)) {
//                    if (map.get(parts).containsKey(item)) {
//                        box.put(item, box.get(item) + 1);
//                        map.put(parts, box);
//                    } else {
//                        box.put(item, 0);
//                        map.put(parts, box);
//                    }
//                } else {
//                    box.put(item, 0);
//                    map.put(parts, box);
//                }
//
//            }
//            System.out.println(map);
            int result = 1;
            for (String s : map.keySet()) {
                result *= map.get(s) + 1;
            }
            result -= 1;
            System.out.println(result);
//            System.out.println("box = " + box);


        }


    }
}
