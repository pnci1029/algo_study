import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        List<Integer> box = new ArrayList<>();
        for (int priority : priorities)
            box.add(priority);

        int count = 0;
        while (!box.isEmpty()) {
            Integer target = box.remove(0);
            if (box.stream().anyMatch(compare -> target < compare)) {
                box.add(target);
            } else {
                count++;
                if (location == 0) {
                    break;
                }
            }
            location--;
            if (location < 0) {
                location = box.size() - 1;
            }
        }

        return count;
    }
}
public class Main {
    public static void main(String[] args) {

        int[] box = {1, 1, 9, 1, 1, 1};
        int n = 0;
        Solution solution = new Solution();
        System.out.println(solution.solution(box,n));
    }
}
