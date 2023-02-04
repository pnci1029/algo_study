package com.example.tdd_prac;

import java.util.Scanner;

public class BackJoon {

    public static int count = 0;
        static Scanner scanner = new Scanner(System.in);

//        static String a = scanner.next();

    public static boolean func(int start, int end,int comp, String a) {
        if (start > comp) {
            return true;
        }
        count++;
        if (!a.substring(start, start + 1).equals(a.substring(end - 1, end))) {
            return false;
        }

        return func(start+1, end-1, comp,a);
    }


    public static void main(String[] args) {
//        int T = scanner.nextInt();
//        for(int i = 0; i < T; i++) {
//            result = 0;
//            System.out.println(isPalindrome(sc.next()) + " " + result);
//        }
        int numb = scanner.nextInt();
        for (int i = 0; i < numb; i++) {
            String a = scanner.next();
            count = 0;
            int length = a.length();
            int comp = length / 2;
            boolean func = func(0, length, comp,a);
            if (func) {
                System.out.println(1 + " " + count);
            } else {
                System.out.println(0 + " " + count);
            }
        }
        scanner.close();


    }
}
