import java.util.Scanner;

/**

 26
 68 84 42 26
 */
public class BackJoon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int original = N;
        int count = 0;

        do {
            int tens = N / 10;
            int units = N % 10;
            int sum = tens + units;
            N = (units * 10) + (sum % 10);
            count++;
        } while (N != original);

        System.out.println(count);



    }
}
