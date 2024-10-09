package com.example.vargenerator.api.controller;

import java.util.*;

/**
 * AABB
 * AAABB
 * ABACABA
 * ABCD
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();

        Map<String, Integer> box2 = new HashMap<>();
        Map<String, Integer> box = new TreeMap<>();
        Arrays.stream(value.split("")).forEach((data) -> {
            box.put(data, box.getOrDefault(data, 0) + 1);
        });

        int oddNumber = 0;
        for (String s : box.keySet()) {
            if (box.get(s) % 2 != 0) {
                oddNumber++;
            }
        }
        if (oddNumber > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            palindrome(box);
        }
    }

    private static void palindrome(Map<String, Integer> box) {
        StringBuilder result = new StringBuilder();

        String leftValue = "";
        for (String s : box.keySet()) {
            int loopCount = box.get(s) / 2;

            for (int i = 0; i < loopCount; i++) {
                result.append(s);
            }
            if (box.get(s) % 2 != 0) {
                leftValue = s;
            }
        }
        System.out.println(result.toString() + leftValue + result.reverse().toString());


    }
}
