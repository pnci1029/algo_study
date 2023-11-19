package com.example.tdd_prac;

import java.util.*;

/**

 3

 */

public class BackJoon {

    private static int N;
    private static int[] box;
    private static int[] arr;
    private static boolean[] booleans;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        box = new int[N];
        arr = new int[N];
        booleans = new boolean[N];

        for (int i = 0; i < N; i++) {
            box[i] = i+1;
        }

        DFS(0, 0);

    }

    public static void DFS(int value, int depth) {
        if (depth == N) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i < N; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                arr[depth] = box[i];
                DFS(value, depth + 1);
                booleans[i] = false;
            }
        }
    }
}

