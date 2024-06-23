package baekJoon.다이나믹프로그래밍;

import java.util.*;

/**
 15

 1
 4
 10


 1
 1 + 3
 1+ 3+ 6
 1+ 3+ 6+ 10

 */

public class BackJoon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int target = in.nextInt();
        List<Integer> total = new ArrayList<>();
        List<Integer> box = new ArrayList<>();
        List<Integer> before = new ArrayList<>();

        box.add(0);
        box.add(1);
        before.add(0);
        before.add(1);
        int add = 1;
        for (int i = 2; i < 122; i++) {
            add++;
            box.add(box.get(i - 1) + add);
            before.add(before.get(i - 1) + box.get(i));

        }

        int[] res = new int[target+1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= target; i++) {

            for (int j = 1; j < 122; j++) {
                if(before.get(j) > i) break;
                res[i] = Math.min(res[i], res[i - before.get(j)]+1);
            }
        }
        System.out.println(res[target]);
//        int result = 0;
//        for (int i = 0; i < before.size(); i++) {
//            if (before.get(i) > target) {
//                result = i;
//                break;
//            }
//        }
    }
}

