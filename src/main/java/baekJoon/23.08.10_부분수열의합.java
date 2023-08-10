package com.example.tdd_prac;

import java.util.*;

/**
 * 4
 * a a
 * ab ba
 * ring gnir
 * newt twan
 * abcd abcd
 */

public class BackJoon {

    private static int N = 0;
    private static int Sum = 0;
    private static int[] box = null;
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        Sum = in.nextInt();

        box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = in.nextInt();
        }



        DFS(0,0);

        if (Sum == 0) {
            System.out.println(answer - 1);
        } else {
            System.out.println(answer);
        }
    }

    public static void DFS(int value, int depth) {
        if (depth == N) {
            if (value == Sum) {
//                System.out.println("success");
                answer++;
            }
//                System.out.println("success1111");
            return;
        }
//        System.out.println("value = " + value);
//        System.out.println("depth = " + depth);

        DFS(value +box[depth], depth +1);
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
        DFS(value, depth+1);

    }

}
