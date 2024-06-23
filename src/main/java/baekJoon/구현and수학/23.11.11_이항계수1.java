package baekJoon.구현and수학;

import java.util.*;

/**
 5 2
 8 4
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();

        int n =1;
        int c =1;
        int k =1;
        int valueA = first - second;
        for (int i = first; i >= 1; i--) {
            n *= i;
        }

        for (int i = valueA; i >= 1; i--) {
            c *= i;
        }
        for (int i = second; i >= 1; i--) {
            k *= i;
        }

        System.out.println(n/(c*k));


    }
}

