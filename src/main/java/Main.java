import java.util.*;

class Solution {
    public long solution(int[] queue1, int[] queue2) {

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
//        queue.offer(10);
//        stack.push(10);
//        stack.remove(0);
        queue.poll();

        System.out.println("stack = " + stack);
        System.out.println("queue = " + queue);

        return 0;
    }
}


public class Main {
    public static void main(String[] args) {

//        int[] a = {3, 2, 7, 2};
//        int[] b = {4, 6, 5, 1};

//        int[] a = {1, 2, 4};
//        int[] b = {3,2,4};
//        int[] a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
//        int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] a = {1, 1, 1, 9, 1};
        int[] b = {1, 1, 1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(a,b));

    }
}
