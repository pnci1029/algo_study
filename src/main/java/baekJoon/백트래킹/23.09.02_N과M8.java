package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 2
 9 8 7 1
 */


public class nrhkm8 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int[] box;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        arr = new int[N];
        box = new int[M];
        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);


        DFS(0, 0);
    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            for (int i : box) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i < N; i++) {
            box[depth] = arr[i];
            DFS(i, depth + 1);
//            DFS(value+1, depth + 1);
        }

    }



    
}
