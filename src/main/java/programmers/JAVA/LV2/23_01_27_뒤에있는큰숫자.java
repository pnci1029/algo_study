import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> box = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            if (box.isEmpty() || numbers[i]<numbers[i-1]) {
                box.push(i);
            } else {
                while (!box.isEmpty() && numbers[box.peek()]<numbers[i]) {
                    answer[box.pop()] = numbers[i];
                }
                box.push(i);
            }
        }
        while(!box.isEmpty()) {
            answer[box.pop()] = -1;
        }

        return answer;
    }
}
