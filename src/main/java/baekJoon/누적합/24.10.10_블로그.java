
import java.util.*;

/**
 5 2
 1 4 2 5 1
 */
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int maxLength = scanner.nextInt();

        int[] box = new int[length];

        for (int i = 0; i < length; i++) {
            box[i] = scanner.nextInt();
        }

        int sampleSum = 0;
        for (int i = 0; i < maxLength; i++) {
            sampleSum += box[i];
        }

        int result = sampleSum;
        int count = 1;
        for (int i = maxLength; i < length; i++) {
            sampleSum = box[i] + sampleSum - box[i - maxLength];

            if (sampleSum > result) {
                result = sampleSum;
                count = 1;
            } else if (sampleSum == result) {
                count++;
            }
        }
        if (result == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(result);
            System.out.println(count);
        }

    }
}
