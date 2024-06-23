package baekJoon.문자열;

import java.util.*;

public class 알파벳개수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String next = in.next();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 97; i <= 122; i++) {
            char a = (char) i;
            map.put(String.valueOf(a), 0);
        }

        String[] split = next.split("");

        for (String value : split) {
            map.put(value, map.get(value) + 1);
        }

        for (Integer value : map.values()) {
            System.out.print(value+" ");
        }

    }

}
