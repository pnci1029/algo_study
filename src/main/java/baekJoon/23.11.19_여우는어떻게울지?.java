package com.example.tdd_prac;

import java.util.*;

/**

 1
 toot woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot
 dog goes woof
 fish goes blub
 elephant goes toot
 seal goes ow
 what does the fox say?

 */

public class BackJoon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        in.nextLine();
        for (int i = 0; i < length; i++) {
            List<String> arr = new ArrayList<>();
            List<String> tootArr = new ArrayList<>();
            String[] s1 = in.nextLine().split(" ");
            for (String s : s1) {
                if (!s.equals("")) {
                    arr.add(s);
                }
            }

            while (true) {
                String line = in.nextLine();
                if (line.contains("what does the fox say?")) {
                    break;
                }
                String target = line.split("goes ")[1];
                tootArr.add(target);
            }
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                if (!tootArr.contains(s)) {
                    sb.append(s).append(" ");
                }
            }
            System.out.println(sb);

        }


    }
}

