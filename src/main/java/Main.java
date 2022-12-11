import java.util.Stack;

class Solution {
    public int solution(int[] order) {

        Stack<Integer> box = new Stack<>();
        int numb = 0;

        for (int j = 1; j <= order.length; j++) {
            box.push(j);
            for (int i = numb; i < order.length; i++) {
                if (!box.isEmpty()) {
                    if (box.peek() == order[i]) {
                        box.pop();
                        numb++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }


        return numb;
    }
}

public class Main {
    public static void main(String[] args) {
//        int[] a = {5,4,3,2,1};
        int[] a = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        Solution solution = new Solution();
        System.out.println(solution.solution(a));

    }
}
