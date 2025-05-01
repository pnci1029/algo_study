import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] values = new int[length][3];

        for (int i = 0; i < length; i++) {
            values[i][0] = sc.nextInt(); // value
            values[i][1] = sc.nextInt(); // strike
            values[i][2] = sc.nextInt(); // ball
        }

        int answer = 0;

        for (int j = 100; j < 1000; j++) {
            int firstCount = j / 100;
            int secondCount = (j / 10) % 10;
            int thirdCount = j % 10;

            if (firstCount == secondCount || secondCount == thirdCount || firstCount == thirdCount ||
                firstCount == 0 || secondCount == 0 || thirdCount == 0) {
                continue;
            }

            boolean isPossible = true;

            for (int i = 0; i < length; i++) {
                int value = values[i][0];
                int strike = values[i][1];
                int ball = values[i][2];

                int first = value / 100;
                int second = (value / 10) % 10;
                int third = value % 10;

                int strikeCount = 0;
                int ballCount = 0;

                if (first == firstCount) strikeCount++;
                if (second == secondCount) strikeCount++;
                if (third == thirdCount) strikeCount++;

                if (first != firstCount && (first == secondCount || first == thirdCount)) ballCount++;
                if (second != secondCount && (second == firstCount || second == thirdCount)) ballCount++;
                if (third != thirdCount && (third == firstCount || third == secondCount)) ballCount++;

                if (strike != strikeCount || ball != ballCount) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) answer++;
        }

        System.out.println(answer);
    }
}
