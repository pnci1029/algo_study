package com.example.tdd_prac;

import java.io.*;
import java.util.*;

public class BackJoon {

    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.peek());
                    queue.poll();

                }
            } else {
                queue.add(value);
            }


        }

    }


}

