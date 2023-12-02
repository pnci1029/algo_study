package com.example.tdd_prac;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**

 156


 */

public class BackJoon {

    private static int N;
    private static int values;
    private static String[]box;
    private static String[] arr;
    private static boolean[] booleans;
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String length = in.next();
        values = Integer.parseInt(length);
        String[] split = length.split("");

        N = split.length;
        box = new String[N];
        booleans = new boolean[N];
        arr = new String[N];

        for (int i = 0; i < split.length; i++) {
            box[i] = split[i];
        }


        DFS(0,0);
        if (set.isEmpty()) {
            System.out.println(0);
        } else {
            AtomicInteger result = new AtomicInteger(10000000);
            set.forEach(value -> result.set(Math.min(result.get(), Integer.parseInt(value))));

            System.out.println(result);
        }

    }

    static void DFS(int value, int depth) {
        if (depth == N) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            if (Integer.parseInt(sb.toString()) > values) {
                set.add(sb.toString());
            }
                return;
        }


        for (int i = 0; i < arr.length; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                arr[depth] = box[i];
                DFS(i, depth + 1);
                booleans[i] = false;
            }
        }


    }

}

