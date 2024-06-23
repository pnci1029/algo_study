package baekJoon.구현and수학;

import java.util.*;

/**
 * 4
 * a a
 * ab ba
 * ring gnir
 * newt twan
 * abcd abcd
 */

public class BackJoon {

    private static int N = 0;
    private static int K = 0;
    private static int[] arr = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = in.nextInt();

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 97; i <= 122; i++) {
            char a = (char) i;
            map1.put(String.valueOf(a), 0);
            map2.put(String.valueOf(a), 0);
        }

        for (int i = 0; i < total; i++) {
            String first = in.next();
            String second = in.next();
//            System.out.println("first = " + first);
//            System.out.println("second = " + second);
            if (first.length() != 1) {
                String[] split1 = first.split("");
                String[] split2 = second.split("");
                for (String s : split1) {
                    map1.put(s, map1.get(s) + 1);
                }
                for (String s : split2) {
                    map2.put(s, map2.get(s) + 1);
                }
//                System.out.println(map1);
//                System.out.println(map2);
                if (map1.equals(map2)) {
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");

                }
            } else {
                if (first.equals(second)) {
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");

                }
            }
            for (int s = 97; s <= 122; s++) {
                char a = (char) s;
                map1.put(String.valueOf(a), 0);
                map2.put(String.valueOf(a), 0);
            }

        }


    }

}
