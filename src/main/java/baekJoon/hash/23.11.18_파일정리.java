package baekJoon.hash;

import java.util.*;

/**
 8
 sbrus.txt
 spc.spc
 acm.icpc
 korea.icpc
 sample.txt
 hello.world
 sogang.spc
 example.txt
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String value = in.next();
            int index = value.indexOf('.');
            String target = value.substring(index + 1);

            map.put(target, map.getOrDefault(target, 0) + 1);
        }
        List<String> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr);
//        System.out.println(arr);

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.println(sb);

    }
}

