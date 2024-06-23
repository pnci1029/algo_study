package baekJoon.구현and수학;

import java.util.*;

public class 피시방알바 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = scanner.nextInt();
        Set<Integer> box = new HashSet<>();
        for (int i = 0; i < numb; i++) {
        int value = scanner.nextInt();
            box.add(value);
        }
        System.out.println(numb - box.size());

    }

}
