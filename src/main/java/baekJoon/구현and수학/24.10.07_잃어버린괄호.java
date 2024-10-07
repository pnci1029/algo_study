import java.util.Arrays;
import java.util.Scanner;

/**
 55-50+40
 10+20+30+40

 55-50+40-30
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();


        if (value.contains("-")) {
            String[] minusBox = value.split("-");
            int result = 0;

            String[] first = minusBox[0].split("\\+");
            for (String s : first) {
                result += Integer.parseInt(s);
            }

            for (int i = 1; i < minusBox.length; i++) {
                String[] split = minusBox[i].split("\\+");
                int minusValue = 0;
                for (String s : split) {
                    minusValue += Integer.parseInt(s);
                }

                result -= minusValue;
            }
                System.out.println(result);


        } else {
            String[] split = value.split("\\+");
            System.out.println(Arrays.stream(split).mapToInt(Integer::parseInt).sum());
        }

    }
}
