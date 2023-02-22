package com.example.tdd_prac;

import java.util.Scanner;

public class BackJoon {
    public static int count = 0;

    public static int func(int a, int b, int c) {
        count++;
        if (count == c) {
            return b;
        }

        return func(b,a+b,c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("0");
        } else {
            System.out.println(func(0, 1,a));;

        }

    }
}
