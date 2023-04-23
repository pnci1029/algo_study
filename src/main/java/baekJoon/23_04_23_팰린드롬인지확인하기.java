package com.example.tdd_prac;

import java.io.*;
import java.util.*;

public class BackJoon {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        int length = value.length() / 2;
        String[] split = value.split("");

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (!split[i].equals(split[split.length-1-i])) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }


    }


}

