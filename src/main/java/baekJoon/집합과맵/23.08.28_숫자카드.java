package baekJoon.집합과맵;

import java.util.*;

/**
 *
 5
 6 3 2 10 -10
 8
 10 9 -5 2 3 4 5 -10
 */


public class 숫자카드 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int a = in.nextInt();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < a; i++) {
            int value = in.nextInt();
            map1.put(value, 0);
        }
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            int value = in.nextInt();
            if (map1.containsKey(value)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());


    }


    
}
