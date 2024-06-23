package baekJoon.구현and수학;

import java.util.*;

/**
 11
 1 4 1 2 4 2 4 2 3 4 4
 2
 **/

public class BackJoon {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int target = in.nextInt();
        if (map.get(target) == null) {
            System.out.println(0);
        } else {
            System.out.println(map.get(target));
        }

    }

}
