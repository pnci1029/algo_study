package baekJoon.구현and수학;

import java.util.*;

/**
 Mississipi
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String target = in.next();

        Map<String, Integer> map = new HashMap<>();

        String[] split = target.split("");
        for (int i = 0; i < split.length; i++) {
            map.put(split[i].toLowerCase(), map.getOrDefault(split[i].toLowerCase(), 0)+1);
        }

        int length = 0;
        for (String s : map.keySet()) {
            length = Math.max(length, map.get(s));
        }
        List<String> arr = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == length) {
                arr.add(s);
            }
        }
        if (arr.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(arr.get(0).toUpperCase());
        }



    }
}

