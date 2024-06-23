package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 2
 9 8 7 1
 */


public class nrhkm7 {

    private static int N;
    private static int M;
    private static int[] container;
    private static int[] arr;

    private static final StringBuilder answer = new StringBuilder("");


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        container = new int[N];
        arr = new int[M];

        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            container[i] = value;
        }

        Arrays.sort(container);
//        System.out.println("container = " + Arrays.toString(container));
        DFS(0, 0);
        System.out.println(answer);
    }


    private static void DFS(int value, int depth) {
        if (depth == M) {
            for (int i : arr) {
                answer.append(i).append(" ");
//                System.out.print(i + " ");
            }
            answer.append("\n");
//            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = container[i];
            DFS(i, depth + 1);
        }

    }

}
