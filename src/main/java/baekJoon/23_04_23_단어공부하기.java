package com.example.tdd_prac;

import java.io.*;
import java.util.*;

public class BackJoon {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().toLowerCase().split("");
        if (split.length == 1) {
            System.out.println(split[0].toUpperCase());
        } else {


            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < split.length; i++) {
                if (!map.containsKey(split[i])) {
                    map.put(split[i], 1);
                } else {
                    map.put(split[i], map.get(split[i]) + 1);
                }
            }

            List<String> keySet = new ArrayList<>(map.keySet());
            keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

            if (map.get(keySet.get(0)).equals(map.get(keySet.get(1)))) {
                System.out.println("?");
            } else {
                System.out.println(keySet.get(0).toUpperCase());
            }
        }
    }
}

