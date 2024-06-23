package baekJoon.정렬;

import java.util.*;
public class BackJoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];
        int[] arr2 = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr2) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
