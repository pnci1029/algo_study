package baekJoon.queue;

import java.util.*;

/**
 15
 push 1
 push 2
 front
 back
 size
 empty
 pop
 pop
 pop
 size
 empty
 pop
 push 3
 empty
 front

 4
 push 1
 pop
 push 1
 pop


 */

    public class queue {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int lastValue = -1;
        in.nextLine();
        for (int i = 0; i < length; i++) {
            String s = in.nextLine().trim();
            String[] s1 = s.split(" ");
//            System.out.println("s = " + s);
//            System.out.println(s1.length);
            if (s1.length > 1) {
                queue.offer(Integer.parseInt(s1[1]));
                lastValue = Integer.parseInt(s1[1]);
            } else {
                if (s.equals("front")) {
                    System.out.println(queue.peek());
                } else if (s.equals("back")) {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(lastValue);
                    }
                } else if (s.equals("size")) {
                    System.out.println(queue.size());
                } else if (s.equals("pop")) {
                    if (!queue.isEmpty()) {
                        System.out.println(queue.poll());

                    } else {
                        System.out.println(-1);
                    }
                } else if (s.equals("empty")) {
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
//        System.out.println("queue = " + queue);

    }

}

