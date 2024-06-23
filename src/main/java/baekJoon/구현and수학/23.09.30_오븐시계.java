package baekJoon.구현and수학;

import java.util.*;

/**
 14 30
 20

 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();

        int target = in.nextInt();

        if (minute + target >= 60) {
            int over = (minute + target) / 60;
            int mintarget = minute + target;
            if (mintarget >= 60) {
                while (true) {
                    mintarget = mintarget - 60 ;
                    if (mintarget < 60) {
                        break;
                    }
                }
            }
            if (over + hour>=24) {
                System.out.println((hour+over - 24) + " " +((mintarget)));
            } else {
                System.out.println((hour+over) + " " +((mintarget)));
            }

        } else {
            System.out.println(hour + " " +(minute + target));
        }



    }
}

