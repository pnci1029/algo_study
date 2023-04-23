package com.example.tdd_prac;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class BackJoon {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);


        Double score = 0.0;
        int count = 0;
        int length = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        while (sc.hasNext()) {
            length++;
            String[] s = sc.nextLine().split(" ");
            if (!s[2].equals("P")) {
                score += Double.parseDouble(s[1]) * map.get(s[2]);
                count += Double.parseDouble(s[1]);
            }


            if (length == 20) {
            System.out.println(decimalFormat.format(score/count));
                break;
            }
//            System.out.println(count);

        }

    }
}

