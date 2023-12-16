package com.example.tdd_prac;

import java.util.*;

/**
 15

 18

 82009

 89005

 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int target = in.nextInt();

        int range = (int) Math.sqrt(target);
        List<Integer> rangeArr = new ArrayList<>();

        for (int i = 1; i <= range; i++) {
            rangeArr.add(i);
        }
        Collections.reverse(rangeArr);
        System.out.println(rangeArr);

        List<Integer> countArr = new ArrayList<>();
        for (int i = 0; i < rangeArr.size(); i++) {
            int numb = rangeArr.get(i);
            int sourceTarget = target;
            int order = i;
            int count = 0;
            while (true) {

                count += sourceTarget / (int) Math.pow(rangeArr.get(order), 2);
                sourceTarget %= (int) Math.pow(rangeArr.get(order), 2);
//                System.out.println("order = " + order);
//                System.out.println(sourceTarget);

                if (sourceTarget == 0) {
                    countArr.add(count);
                    break;
                } else {
                    if (order >= rangeArr.size()) {
                        break;
                    }
                    order++;
                }
            }
        }
        Collections.sort(countArr);
        System.out.println(countArr.get(0));


    }
}

