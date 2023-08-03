package com.example.tdd_prac;

import java.util.*;

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Stack<Integer> box = new Stack<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            if (value != 0) {
                box.push(value);
            } else {
                box.pop();
            }
        }

        int result = 0;
        for (Integer integer : box) {
            result += integer;
        }
        System.out.println(result);
    }

}
