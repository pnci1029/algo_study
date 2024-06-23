package baekJoon.구현and수학;

import java.util.*;

/**
 *
 3
 happy
 new
 year
 */


public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int result = 0;
        int length = in.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
        Map<String, Integer> map = new HashMap<>();
            String value = in.next();
            String[] split = value.split("");
            int count = 0;

            for (int j = 0; j < split.length; j++) {
                if (!map.containsKey(split[j])) {
                    map.put(split[j], 0);
                    count++;
                } else {
                    if (split[j - 1].equals(split[j])) {
                        count++;
                    } else {
                        break;
                    }
                }
//                System.out.println(map);
            }
//            System.out.println(count);
            if (count >= split.length) {
                result++;
            }
        }
        System.out.println(result);

    }


    
}
