package baekJoon;

import java.util.Scanner;

/**
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] box = new int[9][9];

        int maxValue = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int value = scanner.nextInt();
                if (value >= maxValue) {
                    row = i + 1;
                    column = j+1;
                }
                maxValue = Math.max(value, maxValue);
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(maxValue).append("\n").append(row).append(" ").append(column);
        System.out.println(sb);


    }
}
