package baekJoon.집합과맵;

import java.util.*;

/**
 *
7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0
 */


public class 서로다른부분문자열의개수 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String value = in.next();

        String[] values = value.split("");
        Map<String, Integer> map = new HashMap<>();

        List<String> arr = new ArrayList<>();
        
        int start = 0;
        int end = 0;


        while (true) {
            int startIdx = start;
            int endIdx = end;
            String target = value.substring(startIdx, endIdx);
            if (!map.containsKey(target) && !target.equals("")) {
                map.put(target, 0);
            }
            if (startIdx == values.length) {
                break;
            }
            end++;
            if (endIdx == values.length) {
                start++;
                end = start;

            }
        }

        System.out.println(map.size());
//        System.out.println("map = " + map.size());
//        System.out.println("map = " + map);
    }

    
}
