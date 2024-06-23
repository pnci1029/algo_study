package baekJoon.집합과맵;

import java.util.*;

/**
 1
 5
 4 1 5 2 3
 5
 1 3 7 9 5
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int answer = in.nextInt();
            Map<Integer, Integer> answerMap = new HashMap<>();
            for (int j = 0; j < answer; j++) {
                int value = in.nextInt();
                answerMap.put(value, answerMap.getOrDefault(value, 0) + 1);
            }

            int question = in.nextInt();
            List<Integer> questionArr = new ArrayList<>();
            for (int j = 0; j < question; j++) {
                int value = in.nextInt();
                if (answerMap.containsKey(value)) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
//            for (Integer integer : questionArr) {
//                if (answerMap.containsKey(integer)) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(0);
//                }
//            }
        }
        System.out.println(sb);

    }
}

