package com.example.tdd_prac;

import java.util.*;

/**
 839 237
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] first = in.next().split("");
        String[] second = in.next().split("");

        String a = "";
        String b = "";
        for (int i = 2; i >= 0; i--) {
            a += first[i];
            b += second[i];
        }
        System.out.println(Math.max(Integer.parseInt(a),Integer.parseInt(b)));

    }
}

