package baekJoon.집합과맵;

import java.util.*;

/**
 10
 6 3 2 10 10 10 -10 -10 7 3
 8
 10 9 -5 2 3 4 5 -10
 */

public class 숫자카드2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> targetMap = new HashMap<>();

        List<Integer> compareArr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            arr.add(value);
        }
        length = in.nextInt();

        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            compareArr.add(value);
            targetMap.put(value,0);
        }
        for (Integer integer : arr) {
            if (targetMap.containsKey(integer)) {
                targetMap.put(integer, targetMap.get(integer) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : compareArr) {
            sb.append(targetMap.get(integer)).append(" ");
        };
        System.out.println(sb);
    }

}

