package com.example.vargenerator.api.controller;

import java.util.*;

/**
 *
 AABB
 AAABB
 ABACABA
 ABCD
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();

        Map<String, Integer> box2 = new HashMap<>();
        Map<String, Integer> box = new TreeMap<>();
        Arrays.stream(value.split("")).forEach((data) ->{
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
        String result = "";

        String leftValue = "";
        for (String s : box.keySet()) {
            if (box.get(s) % 2 != 0) {
                int loopCount = box.get(s) / 2;

                for (int i = 0; i < loopCount; i++) {
                    result += s;
                }
                leftValue = s;

            } else {
                int loopCount = box.get(s) / 2;

                for (int i = 0; i < loopCount; i++) {
                    result += s;
                }
            }


        }
            String[] split = result.split("");
            result += leftValue;

            for(int i = split.length-1; i >= 0; i--) {
                result += split[i];
            }
            System.out.println(result);

    }
}
