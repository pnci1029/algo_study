import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        HashMap<Integer, Stack<Integer>> hashBox = new HashMap<>();
        for (int i = 1; i <= board.length; i++) {
            hashBox.put(i, new Stack<>());
        }

        for (int i = board.length-1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    hashBox.get(j + 1).add(board[i][j]);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int move : moves) {
            if (!hashBox.get(move).isEmpty()) {
                result.add(hashBox.get(move).pop());
            }
        }
        int ans = 0;
        while (true) {
            int answer = 0;
            for (int i = 1; i < result.size(); i++) {
                if (result.get(i - 1) == result.get(i)) {
                    result.remove(i+0);
                    result.remove(i - 1);
                    answer++;
                    ans+=2;
                }
            }
            if (answer == 0) {
                break;
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};
        Solution solution = new Solution();
        System.out.println(solution.solution(board, move));
    }
}
