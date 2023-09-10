package com.example.tdd_prac;

import java.util.*;

/**
 *
 13
 but
 i
 wont
 hesitate
 no
 more
 no
 more
 it
 cannot
 wait
 im
 yours

 */


public class BackJoon {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Set<String> set = new HashSet<>();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String value = in.next();
            arr.add(value);
            set.add(value);
        }
        Collections.sort(arr,(o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (!sb.toString().contains(s)) {
                sb.append(s).append("\n");
            }
        }

        System.out.println(sb);
    }

}

