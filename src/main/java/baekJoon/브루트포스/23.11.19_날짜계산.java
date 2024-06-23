package baekJoon.브루트포스;

import java.util.*;

/**

 1 2 3

 */

public class BackJoon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        int targetFist = 1;
        int targetSecond = 1;
        int targetThird = 1;

        int count = 1;
        while (true) {
            count++;
            if (targetFist == first && targetSecond == second && targetThird == third) {
                break;
            } else {
                targetFist++;
                targetSecond++;
                targetThird++;
                if (targetFist == 16) {
                    targetFist = 1;
                }
                if (targetSecond == 29) {
                    targetSecond = 1;
                }
                if (targetThird == 20) {
                    targetThird = 1;
                }

            }

        }
        System.out.println(count -1);

    }
}

