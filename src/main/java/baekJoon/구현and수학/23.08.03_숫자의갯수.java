package baekJoon.구현and수학;

import java.util.*;

/**
 * 150
 * 266
 * 427
 */
public class Back숫자의갯수Joon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val1 = in.nextInt();
        int val2 = in.nextInt();
        int val3 = in.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }
        int value = val1 * val2 * val3;
        String[] result = String.valueOf(value).split("");
        for (String s : result) {
            map.put(Integer.parseInt(s), map.get(Integer.parseInt(s)) + 1);
        }


        for (Integer integer : map.values()) {
            System.out.println(integer);
        }


    }

}
