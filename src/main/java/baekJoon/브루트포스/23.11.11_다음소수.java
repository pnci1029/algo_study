package baekJoon.브루트포스;

import java.util.*;

/**
 3
 6
 20
 100
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        for (int i = 0; i < length; i++) {
            long value = in.nextLong();

            while (true) {
                int count =0;
                for (int j = 2; j <= Math.sqrt(value); j++) {
                    if (value % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    if (value == 0 || value == 1) {
                        value = 2;
                    }
                    System.out.println(value);
                    break;
                }
                value++;
            }
        }

//        List<Integer> arr = new ArrayList<>();
//        long length =in.nextLong();
//        long[] box = new long[Math.toIntExact(length)];
//
//        for (long i = 0; i < length; i++) {
//            long value = in.nextLong();
//            box[Math.toIntExact(i)] = value;
//        }
//
//        List<Long> resultBox = new ArrayList<>();
//        for (long a : box) {
//            long value = a+1;
//            while (true) {
//                long count = 0;
//                for (long i = 2; i < value; i++) {
//                    if (value % i == 0) {
//                        count++;
//                        break;
//                    }
//                }
//                if (count == 0) {
//                    resultBox.add(value);
//                    break;
//                } else {
//                    value++;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (Long integer : resultBox) {
//            sb.append(integer).append("\n");
//        }
//        System.out.println(sb);
//
    }
}

