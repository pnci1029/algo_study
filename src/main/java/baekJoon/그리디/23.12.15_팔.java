package baekJoon.그리디;

import java.util.*;

/**
 1 10

 88 88

 800 899

 8808 8880


 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String x = in.next();
        String y = in.next();

        int result = 0;
        if (x.length() != y.length()) {
            System.out.println(0);
        } else {

            String[] xSplit = x.split("");
            String[] ySplit = y.split("");
            for (int i = 0; i < xSplit.length; i++) {
//                if (!xSplit[i].equals("8")) {
//                    continue;
//                }
                if (xSplit[i].equals(ySplit[i]) && xSplit[i].equals("8")) {
                    result++;
                } else if (xSplit[i].equals(ySplit[i])) {
                    continue;
                } else {
                    break;
                }
            }

        System.out.println(result);
        }





//        long startCount =String.valueOf(x).chars().filter(item ->item == '8').count();
//        long endCount =String.valueOf(y).chars().filter(item ->item == '8').count();
//
//        if (!String.valueOf(x).contains("8") || !String.valueOf(y).contains("8")) {
//            System.out.println(0);
//        } else {
//            long count = Math.min(startCount, endCount);
//            if (x < y) {
//                while (true) {
//                    x++;
//                    long xCount = String.valueOf(x).chars().filter(item -> item == '8').count();
//                    if (xCount < count) {
//                        count = xCount;
//                        break;
//                    }
//                    if (x == y) {
//                        break;
//                    }
//                }
//                System.out.println(count);
//            } else {
//                System.out.println(count);
//            }
//
//        }




    }
}

