package baekJoon.hash;

import java.util.*;

/**
 * 3 2
 */

public class qlqjsckwrl {

    private static int N = 0;
    private static int K = 0;
    private static int[] arr = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = in.nextInt();
        int needs = in.nextInt();

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < total; i++) {
            String first = in.next();
            String second = in.next();

            map.put(first, second);
        }

        for (int i = 0; i < needs; i++) {
            String value = in.next();
            System.out.println(map.get(value));
        }


    }

}
