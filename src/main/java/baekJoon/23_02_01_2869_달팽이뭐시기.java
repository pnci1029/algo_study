package com.example.tdd_prac;

import java.util.Scanner;

public class BackJoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // 215 4    516 2   1210102 46    91100 13

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int idxA = c - a; // 90   91
        int idxB = idxA/(a - b); // 45
        if (idxA%(a - b) ==0) {
            System.out.println(idxB+1);
        } else {
            System.out.println(idxB+2);
        }


    }
}
