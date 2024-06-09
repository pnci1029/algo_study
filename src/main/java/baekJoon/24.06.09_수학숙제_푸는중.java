package com.example.jenkinstest;

import java.util.*;

/**
 2
 lo3za4
 01

 4
 43silos0
 zita002
 le2sim
 231233
 */
public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> numberBox = new HashSet<>();

        int length = in.nextInt();
        for (int i = 0; i < length; i++) {
            String value = in.next();
            char[] splitedValue = value.toCharArray();

            String target = "";
            int idx = 0;
            while (idx < splitedValue.length) {
                if (splitedValue[idx] >= 48 && splitedValue[idx] <= 57) {
                    target += splitedValue[idx];
                } else {
                    if (!target.equals("")) {
                        numberBox.add(target);
                    }
                    target = "";
                }
                if (idx == splitedValue.length - 1 && target != "") {
                    if (!target.equals("")) {
                        numberBox.add(target);
                    }

                    target = "";
                }
                idx++;
            }
        }
            StringBuilder sb = new StringBuilder();

        List<String> arr = new ArrayList<>(numberBox);

            Collections.sort(arr);

        for (String integer : arr) {
            sb.append(integer).append("\n");
        }
            System.out.println(sb);
    }
}
