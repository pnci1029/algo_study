package baekJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        int A = data.nextInt();
        int B = data.nextInt();

        if (B >= 45) {
            B = B - 45;
        } else {
            if (A != 0) {
                B = 60 - 45 + B;
                A = A - 1;
            } else {
                B = 60 - 45 + B;
                A = 23;
            }
        }
        System.out.println(A+" "+B);


//        Solution solution = new Solution();
//        System.out.println(solution.solution(box));
    }
}
