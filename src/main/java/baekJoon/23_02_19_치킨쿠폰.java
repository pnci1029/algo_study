package com.example.tdd_prac;

import java.util.*;

public class BackJoon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            long chick = scanner.nextLong();
            long numb = scanner.nextLong();
            if (chick == 0 || numb == 0) {
                break;
            } else {
                long count = chick;
                long nam = 0;
                while (true) {
                    count += chick / numb;
                    nam = chick % numb;
                    if (chick < numb) {
                        break;
                    }
                    chick = chick / numb;
                    chick += nam;
                }
                System.out.println(count);
            }
        }
    }
}

