package com.example.tdd_prac;

import java.util.*;

/**
 5
 1
 3
 8
 -2
 2

 4
 2
 2
 3
 3

 6
 1
 1
 2
 2
 3
 3
 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int max = -500001;
        int min = 500001;
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            max = Math.max(max, value);
            min = Math.min(min, value);
            arr.add(value);
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        List<Integer> arrSort = new ArrayList<>(arr);
        Collections.sort(arrSort);

        int maxValue = Collections.max(map.values());

        List<Integer> common = new ArrayList<>();
        for (Integer integer : arr) {
            if (!common.contains(integer)) {
                if (map.get(integer) == maxValue) {
                    common.add(integer);
                }
            }
        }
        Collections.sort(common);

        int key = 0;
        if (common.size() == 1) {
            key = common.get(0);
        } else {
            key = common.get(1);
        }


        long sum = arr.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
        int middle = arrSort.get((arrSort.size() - 1) / 2);
        int range = max - min;
        System.out.println((int)Math.round((double) sum/length));
        System.out.println(middle);
        System.out.println(key);
        System.out.println(range);


    }
}

