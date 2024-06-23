package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 2
 9 7 9 1
 */


public class nrhkm12 {

    static int N;
    static int M;
//    static int[] box;
    static int[] arr;
    static List<Integer> sampleBox = new ArrayList<>();
//    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

//        box = new int[N];
        arr = new int[M];

        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            if (!sampleBox.contains(value)) {
                sampleBox.add(value);
//                box[i] = value;
            }
        }
        Collections.sort(sampleBox);
//        System.out.println("sampleBox = " + sampleBox);
//        System.out.println("box = " + Arrays.toString(box));
//        Arrays.sort(box);

        DFS(0,0);
        System.out.println(sb);
//        System.out.println("set = " + set);
    }


    static void DFS(int value, int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }

//            if (!set.contains(sb.toString())) {
                sb.append("\n");
//            }
//            set.add(String.valueOf(sb.toString()));

            return;
        }

        for (int i = 0; i < sampleBox.size(); i++) {
            arr[depth] = sampleBox.get(i);
            DFS(i,depth+1);
        }

    }
}
