package baekJoon.스택큐덱;

import java.util.*;

/**
 5
 5 4 1 3 2

 3
 2 1 3

 5
 3 1 2 4 5

 5
 5 3 1 2 4
 */

public class 도키도키간식드리미 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < length; i++) {
            int value = in.nextInt();
            max = Math.max(max, value);
            queue.add(value);
        }


        Stack<Integer> stack = new Stack<>();
        int target = 1;
        while (true) {
            if (queue.peek().equals(target)) {
                queue.poll();
                target++;
            } else if (!stack.isEmpty() && stack.peek().equals(target)) {
                stack.pop();
                target++;
            } else {
                stack.add(queue.poll());
            }

            if (queue.isEmpty()) {
                break;
            }
         }
//        System.out.println("queue = " + queue);
//        System.out.println("stack = " + stack);

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (stack.peek().equals(target)) {
                target++;
                stack.pop();
            } else {
                System.out.println("Sad");
                break;
            }
        }
        if (queue.isEmpty() && stack.isEmpty()) {
            System.out.println("Nice");
        }
//        System.out.println("queue = " + queue);
//        System.out.println("stack = " + stack);





    }
}

