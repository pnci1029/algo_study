package baekJoon.집합과맵;

import java.util.*;

/**
 4
 2
 1
 2
 12
 1

 6
 3
 72
 2
 12
 7
 2
 1
 */

public class BackJoon {

    private static int N;
    private static int M;
    private static int[]box;
    private static int[]arr;
    private static final Set<String> set = new HashSet<>();
    private static boolean[] check;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        box = new int[M];
        arr = new int[N];
        check = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        DFS(0, 0);
//        System.out.println(set);
        System.out.println(set.size());
    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i : box) {
                sb.append(i);
            }
//            System.out.println(sb);
            set.add(sb.toString());
            return;
        }

        for (int i = value; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                box[depth] = arr[i];
                DFS(value, depth + 1);
                check[i] = false;
            }
        }
    }


}

