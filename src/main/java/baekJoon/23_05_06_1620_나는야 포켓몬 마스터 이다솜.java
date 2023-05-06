package com.example.tdd_prac;

import java.util.*;
public class BackJoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.next().split(" ")[0]);
        int quest = Integer.parseInt(sc.next().split(" ")[0]);


        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= length + quest; i++) {
            if (i <= length) {
                map.put(sc.next(), String.valueOf(i));
            } else {
                arr.add(sc.next());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : map.keySet()) {
            map2.put(map.get(s), s);
        }
        for (String s : arr) {
            if (map.containsKey(s)) {
                sb.append(Integer.parseInt(map.get(s))).append("\n");
            } else {
                sb.append(map2.get(s)).append("\n");
            }
        }

        System.out.println(sb.toString());



    }
}
