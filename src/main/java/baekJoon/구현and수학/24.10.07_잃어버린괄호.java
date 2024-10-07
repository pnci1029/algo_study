import java.util.Arrays;
import java.util.Scanner;

/**
 55-50+40
 10+20+30+40
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();

        String[] type = {"+", "-"};

        if (value.contains("-")) {
            String[] split = value.split("-");
            String[] positive = split[0].split("\\+");
            String[] negative = split[1].split("\\+");

            int positiveResult = Arrays.stream(positive).mapToInt(Integer::parseInt).sum();
            int negativeResult = Arrays.stream(negative).mapToInt(Integer::parseInt).sum();


            System.out.println(positiveResult - negativeResult);
        } else {
            String[] split = value.split("\\+");
            System.out.println(Arrays.stream(split).mapToInt(Integer::parseInt).sum());
        }

    }
}
