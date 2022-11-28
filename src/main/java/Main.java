class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 4}, {3, 2}};
        int[][] b = {{3, 3}, {3, 3}};


        Solution solution = new Solution();
        System.out.println(solution.solution(a, b));
    }
}
