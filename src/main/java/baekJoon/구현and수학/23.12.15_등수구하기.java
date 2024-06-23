package baekJoon.구현and수학;

import java.util.*;

/**
 10 1 10
 10 9 8 7 6 5 4 3 2 1

 10 1 10
 10 9 8 7 6 5 4 3 3 0

 3 90 10
 100 90 80

 12 100 10
 100 100 100 100 100 100 100 100 100 90 90 90


 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int target = in.nextInt();
        int max = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> box = new ArrayList<>();
        box.add(target);
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            if (!box.contains(value)) {
                box.add(value);
            }
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        map.put(target, map.getOrDefault(target, 0) + 1);

        Collections.sort(box);
        Collections.reverse(box);

        int numb = 0;
        for (Integer integer : box) {
            if (integer == target) {
                if (map.get(integer) + numb > max) {
                    numb = -1;
                } else {
                    numb++;
                }
                break;
            }
            numb += map.get(integer);
        }

//        for (int i = box.size() - 1; i >= 0; i--) {
//            numb += map.get(box.get(i));
//            System.out.println("numb = " + numb);
//            System.out.println("i = " + i);
//            if (box.get(i) == target) {
//                System.out.println(numb);
//                break;
//            }
//
//
//        }
        if (numb == 0) {
            System.out.println(1);
        } else {
            if (numb > max) {
                System.out.println(-1);
            } else {
                System.out.println(numb);
            }
        }

    }
}

