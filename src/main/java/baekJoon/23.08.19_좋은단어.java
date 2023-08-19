package com.example.tdd_prac;

import java.util.*;

/**
 *
 4 2
 9 8 7 1
 */

public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;

        int length = in.nextInt();

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String value = in.next();
            arr.add(value);
        }

        for (int i = 0; i < arr.size(); i++) {
            Stack<String> stack = new Stack<>();

            String[] split = arr.get(i).split("");
            for (String s : split) {
                if (stack.isEmpty()) {
                    stack.push(s);
                } else if (stack.peek().equals(s)) {
                    stack.pop();
                } else {
                    stack.push(s);
                }

            }
            if (stack.isEmpty()) {
                result++;
            }

        }
        System.out.println(result);


    }
}
