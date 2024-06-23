package baekJoon.백트래킹;

import java.util.*;

/**
 * 3 2
 *
 * 1 1
 * 1 2
 * 1 3
 * 2 1
 * 2 2
 * 2 3
 * 3 1
 * 3 2
 * 3 3
 */

public class nrhkm4 {

    private static int N = 0;
    private static int K = 0;
    private static int[] arr = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();

        arr = new int[K];
        DFS(1,0);

    }

    public static void DFS(int value, int depth) {

        if (depth == K) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i <= N; i++) {
            arr[depth] = i;
//            System.out.println(i);
//            if (value == 1) {
            DFS(i, depth + 1);
//            } else {
//                DFS(value + 1, depth + 1);

//            }
        }
//        System.out.println(Arrays.toString(arr));
    }

}
