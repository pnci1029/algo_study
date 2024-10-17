package com.example.vargenerator.api.controller;

import java.util.*;

/**
 5
 Mickey 1 10 1991
 Alice 30 12 1990
 Tom 15 8 1993
 Jerry 18 9 1990
 Garfield 20 9 1990

 https://www.acmicpc.net/problem/5635
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<length; i++){
            String name = scanner.next();
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            map.put(name, (year * 1000) + (month * 100) + day);
        }

        String youngest = "";
        String oldest = "";

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : map.keySet()) {
            min = Math.min(min, map.get(s));
            max = Math.max(max, map.get(s));
        }

        for (String s : map.keySet()) {
            if (map.get(s) == min) {
                oldest = s;
            }
            if (map.get(s) == max) {
                youngest = s;
            }
        }
        System.out.println(youngest);
        System.out.println(oldest);
    }
}
