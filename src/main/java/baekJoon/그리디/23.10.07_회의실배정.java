package baekJoon.그리디;

import java.util.*;

/**
 11
 1 4
 3 5
 0 6
 5 7
 3 8
 5 9
 6 10
 8 11
 8 12
 2 13
 12 14

 3
 0 0
 0 0
 0 0

 3
 4 4
 3 4
 2 4
 */

public class 회의실배정 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[][] box = new int[length][2];
        for (int i = 0; i < length; i++) {
            int value1 = in.nextInt();
            int value2 = in.nextInt();
            box[i][0] = value1;
            box[i][1] = value2;
        }

        Arrays.sort(box, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int result = 0;
        int endTime = 0;
        for (int i = 0; i < length; i++) {
            if (endTime<=box[i][0]) {
                result++;
                endTime = box[i][1];
            }
        }
        System.out.println(result);


    }
}

