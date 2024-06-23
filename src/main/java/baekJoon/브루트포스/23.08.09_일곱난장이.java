package baekJoon.브루트포스;

import java.util.*;

/**
 * 3 2
 */

public class 일곱난쟁이 {

    private static int N = 0;
    private static int K = 0;
    private static int[] arr = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            arr.add(in.nextInt());
        }

        while (true) {
            Collections.shuffle(arr);
            int numb = 0;
            for (int i = 0; i < 7; i++) {
                numb +=arr.get(i);
            }
            if (numb == 100) {
                break;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            result.add(arr.get(i));
        }

        Collections.sort(result);

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

}
