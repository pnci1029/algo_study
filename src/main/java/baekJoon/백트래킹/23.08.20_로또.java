package baekJoon.백트래킹;

import java.util.*;

/**
 *
7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0
 */


public class 로또 {

    private static int N;
    private static int[] arr;
    private static int[] container;
    private static boolean[] booleans;



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < 1000; i++) {
            String[] s = in.nextLine().split(" ");
            if (s[0].equals("0")) {
                break;
            }
            N = Integer.parseInt(s[0]);

            container = new int[N];
            booleans = new boolean[N];
            arr = new int[6];


            for (int j = 0; j < N; j++) {
                container[j] = Integer.parseInt(s[j+1]);
            }

            DFS(0,0);
            System.out.println();


        }


    }

    private static void DFS(int value, int depth) {
        if (depth == 6) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i < N; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                arr[depth] = container[i];
                DFS(i, depth + 1);
                booleans[i] = false;
            }
        }

    }
}
