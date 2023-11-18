package com.example.tdd_prac;

import java.util.*;

/**
 4 2
 9 7 9 1
 */

public class BackJoon {

    private static int N;
    private static int M;
    private static int[] box;
    private static int[] arr;
    private static Stack<String> stack = new Stack<>();
    public static StringBuilder result = new StringBuilder();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        box = new int[M];
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        DFS(0, 0);
        System.out.println(result);
    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i : box) {
                sb.append(i).append(" ");
            }
            if (!stack.contains(sb.toString())) {
                result.append(sb).append("\n");
                stack.add(sb.toString());
            }
            return;
        }
        for (int i = value; i < N; i++) {
            box[depth] = arr[i];
            DFS(i,depth +1);
        }



    }
}

