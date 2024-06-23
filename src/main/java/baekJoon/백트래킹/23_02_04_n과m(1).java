package baekJoon.백트래킹;

import java.util.Scanner;

public class nrhkm1 {

    static int[] arr;
    static boolean[] visit;

    public static void dfs(int numb, int length, int num) {
        if (num == length) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < numb; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[num] = i+1;
                dfs(numb, length, num + 1);
                visit[i] = false;
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = scanner.nextInt();
        int length = scanner.nextInt();

        arr = new int[length];
        visit = new boolean[numb];

        dfs(numb, length, 0);


    }
}
