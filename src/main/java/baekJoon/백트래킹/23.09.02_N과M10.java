package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 2
 9 7 9 1
 */


public class nrhkm10 {

    private static int N;
    private static int M;
    private static final List<Integer> arr = new ArrayList<>();
    private static int[] box;
    private static boolean[] booleans;
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
//        arr = new int[N];
        box = new int[M];
        booleans = new boolean[N];
        for (int i = 0; i < N; i++) {
            int value = in.nextInt();

//            arr[i] = value;
//            if (!arr.contains(value)) {
                arr.add(value);
//            }
        }
        Collections.sort(arr);
        N = arr.size();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(box));

        DFS(0,0);

    }

    public static void DFS(int value, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i : box) {
                sb.append(i).append(" ");
            }
            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                System.out.println(sb.toString());
            }
            return;
        }

        for (int i = value; i < N; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
//                box[depth] = arr[i];
                box[depth] = arr.get(i);
                DFS(i+1, depth + 1);
                booleans[i] = false;
            }
        }
    }
}
