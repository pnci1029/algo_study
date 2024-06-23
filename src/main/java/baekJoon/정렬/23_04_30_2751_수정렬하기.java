package baekJoon.정렬;

import java.io.*;
import java.util.*;

public class 수정렬하기_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (Integer integer : arr) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb);

    }
}

