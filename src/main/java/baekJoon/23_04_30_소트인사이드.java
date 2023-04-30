package com.example.tdd_prac;

import java.util.*;
public class BackJoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] split = sc.next().split("");
        Arrays.sort(split);
        List<String> arr = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = split.length-1; i >= 0; i--) {
            sb.append(split[i]);
            arr.add(split[i]);
        }

        System.out.println(sb
        );

    }
}
