package com.example.tdd_prac;
import java.util.*;

public class BackJoon {

    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int numb, int length, int target) {
        if (target == length) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < numb; i++) {
            if (!visit[i]) {
                arr[target] = i + 1;
                dfs(numb, length, target + 1);
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

        System.out.println(sb);
    }

}
