
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();


        int result = 666;


        while (true) {
            String[] split = String.valueOf(result).split("");
            int sixCount = 0;
            for (String s : split) {
                if (s.equals("6")) {
                    sixCount++;
                }
                if (sixCount >= 3) {
                    value--;
                    break;
                }
            }


            if (value == 0 ) {
                break;
            } else {
                result++;
            }
        }
        System.out.println(result);

    }


}
