package baekJoon.구현and수학;

import java.util.*;

/**
 9
 10 20 30 40 50 60 70 80 90
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        int max = -1;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            sum += value;
            max = Math.max(max, value);
        }
        double result = sum / (max * length) * 100;
        System.out.println(result);




    }
}

