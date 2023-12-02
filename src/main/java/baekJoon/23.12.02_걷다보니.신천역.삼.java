package com.example.tdd_prac;

import java.util.*;

/**

 3

 */

public class BackJoon {

    private static int N;
    private static int[] box = {0, 1, 2};
    private static int[] arr;
    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        DFS(0,0);
//        System.out.println(set);
        System.out.println(set.size());

    }

    static void DFS(int value, int depth) {
        if (depth == N) {
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i);
            }
//            System.out.println(sb);
            if (Integer.parseInt(String.valueOf(sb)) % 3 == 0 && Integer.parseInt(sb.toString()) >=Math.pow(10,N-1)) {
                set.add(Integer.valueOf(sb.toString()));
            }
            return;
        }

        for (int i = 0; i < box.length; i++) {
            arr[depth] = box[i];
            DFS(i, depth + 1);
        }
    }

}

