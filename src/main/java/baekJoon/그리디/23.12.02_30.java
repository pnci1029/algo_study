package baekJoon.그리디;

import java.util.*;

/**

 80875542

 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] split = in.next().split("");
        List<String> arr = new ArrayList<>();

        int sum = 0;
        int zeroCount = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            arr.add(s);
            if (s.equals("0")) {
                zeroCount++;
            }
            sum += Integer.parseInt(s);
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        if (zeroCount == 0 || sum % 3 != 0 || split.length ==1) {
            System.out.println(-1);
        } else {
            for (String s : arr) {
                sb.append(s);
            }
            System.out.println(sb);
        }


    }
}

