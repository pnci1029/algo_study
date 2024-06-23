import java.util.*;

/**

 5 8 20
 5 8 17
 2 8 20
 0 0 0
 */
public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int caseNumber = 0;
        while (true) {
            caseNumber++;
            int ref = in.nextInt();
            int rule = in.nextInt();
            int given = in.nextInt();
            if (ref == rule && rule == given && rule == 0) {
                break;
            }

            int result = 0;


            while (given > rule) {
                given -= rule;
                result += ref;
            }
                if (given > 0) {
//                    System.out.println("given = " + given);
                    if (ref > given) {
                        result += given;
                    } else {
                        result += ref;
                    }
                }
            System.out.println("Case "+ caseNumber + ": "+result);

        }

    }
}
