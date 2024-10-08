import java.util.Scanner;

/**
 * 3
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();


        String result = "666";


        while (true) {
            if (result.contains("666")) {
                value--;
            }
            if (value == 0) {
                break;
            } else {
                result = String.valueOf(Integer.parseInt(result) + 1);
            }
        }
        System.out.println(result);
    }
}
