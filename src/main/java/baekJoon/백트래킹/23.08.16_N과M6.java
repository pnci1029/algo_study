package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 2
 9 8 7 1
 */

public class nrhkm6 {

    private static int N;
    private static int M;
    private static int A;
    private static int[] arr;
    private static int[] container;
    private static boolean[] booleans;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];
        container = new int[N];
        booleans = new boolean[N];
        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            container[i] = value;
        }
        Arrays.sort(container);
//        System.out.println("container = " + Arrays.toString(container));
        DFS(0,0);

    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i < N; i++) {

                if (arr[depth] < container[i]) {

                }
            if (!booleans[i]) {
                booleans[i] = true;
                arr[depth] = container[i];
                DFS(i + 1, depth + 1);
                booleans[i] = false;
            }

        }


    }
}
