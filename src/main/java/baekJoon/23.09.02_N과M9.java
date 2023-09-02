package com.example.tdd_prac;

import java.util.*;

/**
 *
 4 2
 9 7 9 1
 */


public class BackJoon {

    private static int N;
    private static int M;
    private static final List<Integer> arr = new ArrayList<>();
    private static int[] box;
    private static boolean[] booleans;
    private static Set<String> set = new HashSet<>();


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        box = new int[M];
        booleans = new boolean[N];
        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
//            if (!arr.contains(value)) {
                arr.add(value);
//            }
        }
        N = arr.size();
        Collections.sort(arr);

        DFS(0,0);
//        System.out.println(set);

    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i : box) {
                sb.append(i).append(" ");
//                set.add(sb.toString());
            }
//            System.out.println(set.contains(sb.toString()));
//            System.out.println(sb);
//            System.out.println(set);

            if (!set.contains(sb.toString())) {
                System.out.print(sb);
                set.add(sb.toString());
                System.out.println();
            }
            return;
        }

        for (int i = value; i < N; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                box[depth] = arr.get(i);
                DFS(value, depth + 1);
                booleans[i] = false;
            }
        }

    }

    
}
