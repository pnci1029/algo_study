package com.example.tdd_prac;

import java.util.*;

/**
 3 4
 ohhenrie
 charlie
 baesangwook
 obama
 baesangwook
 ohhenrie
 clinton

 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int neverHeard = in.nextInt();
        int neverSean = in.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < neverHeard; i++) {
            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < neverSean; i++) {
            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int count = 0;
        List<String> arr = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) >= 2) {
                arr.add(s);
                count++;
            }
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        for (String s : arr) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);


    }
}

