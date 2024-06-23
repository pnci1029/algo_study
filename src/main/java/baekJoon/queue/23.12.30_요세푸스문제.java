package baekJoon.queue;

import java.util.*;

/**
 7 3

 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int range = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= length; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (queue.size() != 1) {
            for (int i = 0; i < range - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }


}
