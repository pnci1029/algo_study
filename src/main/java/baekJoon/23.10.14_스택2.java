package com.example.tdd_prac;

import java.util.*;

/**
 9
 4
 1 3
 1 5
 3
 2
 5
 2
 2
 5
 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        Stack<Integer> stack = new Stack<>();
//        Queue<Integer> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int next = in.nextInt();
            int nextValue = 0;
            if (next == 1) {
                nextValue = in.nextInt();
            }
            if (next == 1) {
                stack.add(nextValue);
            } else if (next == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int peek = stack.peek();
                    sb.append(peek).append("\n");
                    stack.pop();
                }
            } else if (next == 3) {
                sb.append(stack.size()).append("\n");
            } else if (next == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (next == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int peek = stack.peek();
                    sb.append(peek).append("\n");
                }
            }
//                System.out.print(next);
//                System.out.println();
//            if (nextValue != 0) {
//                System.out.print(nextValue);
//
//            }
        }
        System.out.println(sb);
    }
}

