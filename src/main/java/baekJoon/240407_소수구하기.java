
import java.util.Scanner;

public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        boolean[] booleans = new boolean[1000001];
        booleans[0] = false;
        booleans[1] = false;
        booleans[2] = false;

        for (int i = 2; i <= booleans.length/2; i++) {
            for (int j = 2; j <= booleans.length/2; j++) {
                if (i * j >= booleans.length) {
                    break;
                } else {
                    booleans[i * j] = true;
                }
            }
        }
        for (int i = 2; i < booleans.length; i++) {
            if (!booleans[i] && i >= N && i <= M) {
                System.out.println(i);
            }
        }
//        for (int i = 0; i < booleans.length; i++) {
//            System.out.println(booleans[i] + "   "+i);
//        }


    }

}
