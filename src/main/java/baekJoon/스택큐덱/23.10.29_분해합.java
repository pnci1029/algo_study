package baekJoon.스택큐덱;

import java.util.*;

/**
 216
 */

public class 분해합 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String target = in.next();

        int compare = 0;
        for (int i = 0; i < Integer.parseInt(target); i++) {
            String[] split = String.valueOf(i).split("");
            int sum = 0;
            for (String s : split) {
                sum += Integer.parseInt(s);
            }
            if (sum + i == Integer.parseInt(target)) {
                System.out.println(i);
                compare = 1;
                break;
            }
        }
        if (compare == 0) {
            System.out.println(0);
        }
    }
}

