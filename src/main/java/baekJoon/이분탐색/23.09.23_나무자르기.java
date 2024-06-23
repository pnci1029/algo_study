package baekJoon.이분탐색;

import java.util.*;

/**
 4 7
 20 15 10 17

 5 20
 4 42 40 26 46
 */

public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int wish = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            arr.add(value);
        }
        Collections.sort(arr);

        int max = arr.get(arr.size() - 1);
        int min = 0;
//        int compare = (max + min) / 2;
//        System.out.println(compare);
//        System.out.println(max);


        while (min<max) {
//            if (max > min) {
//                break;
//            }

            int mid = (max + min) / 2;
            long calculator = 0;
            for (Integer integer : arr) {
                if (integer - mid > 0) {
                    calculator += integer - mid;
                }
            }


            if (calculator >= wish) {
                min = mid+1;
            } else {
                max = mid;
            }
        }
        System.out.print(min-1);
//        while (true) {
//            int wishMaxValue = max;
//            int wishMinValue = min;
//            System.out.println(wishMaxValue);
//            int calculMaxValue = 0;
//            int calculMinValue = 0;
//
//            for (Integer integer : arr) {
//                if (integer - wishMaxValue > 0) {
//                    calculMaxValue += integer - wishMaxValue;
//                }
//                if (integer - wishMinValue > 0) {
//                    calculMinValue += integer - wishMinValue;
//                }
//            }
//            if (calculMaxValue >= wish) {
//                System.out.println("max = " + max);
//                break;
//            }
//            if (calculMinValue >= wishMinValue) {
//                System.out.println("min = " + min);
//                break;
//            }
//            max--;
//            min--;
//
//        }


    }

}

