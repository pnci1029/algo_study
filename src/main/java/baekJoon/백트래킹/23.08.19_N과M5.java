package baekJoon.백트래킹;

import java.util.*;

/**
 * 4
 4 2
 9 8 7 1
 */

public class nrhkm5 {
    private static int length;
    private static int soutLength;
    private static int[] arr;
    private static int[] container;
    private static boolean[] booleans;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        length = in.nextInt();
        soutLength = in.nextInt();
        container = new int[length];


        arr = new int[soutLength];
        booleans = new boolean[length];
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            container[i] = value;
        }
        Arrays.sort(container);

//        System.out.println("arr = " + Arrays.toString(arr));
//        System.out.println("length = " + length);
//        System.out.println("soutLength = " + soutLength);
//        System.out.println("container = " + Arrays.toString(container));
//        System.out.println("bool = " + Arrays.toString(booleans));
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        DFS(0,0);



    }

    public static void DFS(int value, int depth) {

        if (depth == soutLength) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
                System.out.println();
            return;
        }
//        System.out.println("value = " + value);
//        System.out.println("depth = " + depth);
        for (int i = 0; i < length; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                arr[depth] = container[i];
                DFS(i+1, depth+1);
                booleans[i] = false;
            }
        }



//        DFS(depth+1, depth + 1);
    }

}
