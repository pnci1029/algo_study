package baekJoon.정렬;

import java.util.*;

/**
 5 2
 100 76 85 93 98
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int target = in.nextInt();

        int[] box = new int[length];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
//            box[i] = in.nextInt();
            arr.add(in.nextInt());
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        System.out.println(arr.get(target-1));
    }
}

