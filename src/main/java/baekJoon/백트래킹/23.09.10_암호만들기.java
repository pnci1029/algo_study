package baekJoon.백트래킹;

import java.util.*;

/**
 *
 4 6
 a t c i s w

 3 6
 a e i c d z

 3 5
 a e i b c
 */


public class dkaghaksemfrl {

    static int N;
    static int M;
    static String[] box;
    static String[] arr;
    static boolean[] booleans;
    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        box = new String[M];
        booleans = new boolean[M];
        arr = new String[N];
        for (int i = 0; i < M; i++) {
            String value = in.next();
            box[i] = value;
        }
        Arrays.sort(box);

        DFS(0, 0);


        String[] lines = sb.toString().split("\n");
        Arrays.sort(lines);


    }

    static void DFS(int value, int depth) {
        if (depth == N) {
            StringBuilder sbSample = new StringBuilder();
            for (String s : arr) {
                sbSample.append(s);
            }
            if (isValid(sbSample.toString())) {
                System.out.println(sbSample);
            }

            return;
        }


        for (int i = value; i < M; i++) {
                arr[depth] = box[i];
                DFS(i+1,depth+1);
//            if (!booleans[i]) {
//                booleans[i] = true;
//                booleans[i] = false;
//            }
        }
    }

    static boolean isValid(String i) {
        char[] chars = i.toCharArray();
        int moScore = 0;
        int jaScore = 0;
        for (char aChar : chars) {
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                moScore++;
            } else {
                jaScore++;
            }
        }

        return moScore >= 1 && jaScore >= 2;
    }

}





//public class BackJoon {
//
//    static int N;
//    static int M;
//    static String[] box;
//    static String[] arr;
//    static boolean[] booleans;
//    static Set<String> set = new HashSet<>();
//    static StringBuilder sb = new StringBuilder();
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//
//        N = in.nextInt();
//        M = in.nextInt();
//
//        box = new String[M];
//        booleans = new boolean[M];
//        arr = new String[N];
//        for (int i = 0; i < M; i++) {
//            String value = in.next();
//            box[i] = value;
//        }
////        Arrays.sort(box);
//
//        DFS(0, 0);
//        StringBuilder result = new StringBuilder();
////        List<String> sortedKeys = new ArrayList<>(set);
////        Collections.sort(sortedKeys);
////        for (String sortedKey : sortedKeys) {
////            result.append(sortedKey).append("\n");
////        }
////        System.out.println(result);
////        System.out.println(set);
////        System.out.println(sb);
//
//        String[] lines = sb.toString().split("\n");
//        Arrays.sort(lines);
//        for (String line : lines) {
//            result.append("")
//        }
//
//
//    }
//
//    static void DFS(int value, int depth) {
//        if (depth == N) {
//            StringBuilder sbSample = new StringBuilder();
//            int jaScore = 0;
//            int moScore=0;
//            for (String i : arr) {
//                if (i.equals("a") ||
//                        i.equals("e") ||
//                        i.equals("i") ||
//                        i.equals("o") ||
//                        i.equals("u")) {
//                    moScore++;
//                } else {
//                    jaScore++;
//                }
//                sbSample.append(i);
////                sb.append(i);
//            }
//            if (jaScore >= 2 && moScore >= 1 && !set.contains(sbSample.toString())) {
//                char[] charArray = sbSample.toString().toCharArray();
//
//                Arrays.sort(charArray);
//
//                sbSample.setLength(0);
//                sbSample.append(charArray);
//                if (!sb.toString().contains(sbSample)) {
//                    sb.append(sbSample.toString()).append("\n");
//                }
//                set.add(sbSample.toString());
//            }
//            return;
//        }
//
//        for (int i = value; i < M; i++) {
//            if (!booleans[i]) {
//                booleans[i] = true;
//                arr[depth] = box[i];
//                DFS(value,depth+1);
//                booleans[i] = false;
//            }
//        }
//    }
//}
