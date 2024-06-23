package baekJoon.백트래킹;

import java.io.IOException;
import java.util.*;

public class BackJoon {

    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(1, 0);

    }

    public static void dfs(int value, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = value; i <= N; i++) {

            arr[depth] = i;
            dfs(i + 1, depth + 1);

        }
    }
}
