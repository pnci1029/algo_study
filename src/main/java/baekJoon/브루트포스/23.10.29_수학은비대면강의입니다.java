package baekJoon.브루트포스;

import java.util.*;

/**
 1 3 -1 4 1 7
 2 5 8 3 -4 -11
 */

public class 수학은비대면강의입니다 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
//        int[] c = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = in.nextInt();
        }
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i]+b[i];
//        }

//        System.out.println("c = " + Arrays.toString(c));
        int[] answerBox = new int[2];
        boolean isFinished = false;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
//                if ((c[0] * i) + (c[1] * j) == c[2]) {
                if((a[0] * i + a[1] * j == a[2])&& b[0] * i + b[1] * j == b[2]){
                    answerBox[0] = i;
                    answerBox[1] = j;
                    isFinished = true;
                    break;
                }
            }
            if (isFinished) {
                break;
            }
        }
        for (int box : answerBox) {
            System.out.print(box + " ");
        }

    }
}

