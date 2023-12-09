package com.example.tdd_prac;

import java.util.*;

/**
 XXXX....XXX.....XX

 XX.XXXXXXXXXX..XXXXXXXX...XXXXXX
 */

public class BackJoon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String target = in.next();

        target = target.replace("XXXX", "AAAA");
        target = target.replace("XX", "BB");

        if (target.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(target);
        }

    }
}

