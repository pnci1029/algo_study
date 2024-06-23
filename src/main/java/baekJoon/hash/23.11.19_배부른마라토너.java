package baekJoon.hash;

import java.util.*;

/**

 3
 leo
 kiki
 eden
 eden
 kiki

 */

public class BackJoon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int length = in.nextInt();

        for (int i = 0; i < length; i++) {
            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < length - 1; i++) {
            String value = in.next();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

//        System.out.println(map);
        String result = "";
        for (String s : map.keySet()) {
            if (map.get(s) % 2 != 0) {
                result = s;
            }
        }
        System.out.println(result);


    }
}

