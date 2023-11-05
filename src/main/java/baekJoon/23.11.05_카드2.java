package com.example.tdd_prac;

import java.util.*;

/**
 6
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            queue.add(String.valueOf(i + 1));
        }
        int count = 0;
        while (queue.size() > 1) {
            if (count == 0) {
                queue.poll();
                count = 1;
            } else {
                queue.add(queue.peek());
                queue.poll();
                count = 0;
            }
        }
        System.out.println(queue.peek());



    }
}

