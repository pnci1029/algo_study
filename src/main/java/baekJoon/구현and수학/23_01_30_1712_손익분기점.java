package baekJoon.구현and수학;

import java.util.Scanner;

public class 손익분기점 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;
        if (b >= c) {
            count = -1;
        } else {
            count = a / (c - b) + 1;
        }

        System.out.println(count);

    }
}
