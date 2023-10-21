package com.example.tdd_prac;

import java.util.*;

/**
 15
 push 1
 push 2
 front
 back
 size
 empty
 pop
 pop
 pop
 size
 empty
 pop
 push 3
 empty
 front
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        int numb = 0;
        for (int i = 0; i < length; i++) {
            String command = in.next();
            if (command.equals("push")) {
                numb = in.nextInt();
                queue.offer(numb);
                continue;
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(numb).append("\n");
                }
            }
        }
        System.out.println(sb);


    }
}

