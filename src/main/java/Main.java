class Solution {
    public int solution(int n, int[] m) {
        int buy = 0;
        int total = 0;
        if (n > 100000 ) {
            return -1;
        }
        if (n <= 0) {
            return -1;
        }
        for (int i = 0; i < m.length; i++) {
            int max = 0;
            for (int j = i; j < m.length; j++) {
                if (m[j] >= max) {
                    max = m[j];
                }
            }
            if (max > 1000) {
                return -1;
            }
            if (m[i] < max) {
                buy++;
                total -= m[i];
            } else {
                total += m[i] * buy;
                buy = 0;
            }
        }


        return total;
    }
}

public class Main {
    public static void main(String[] args) {

//        int[] board = {1,5,10,2,4,3};
//        int b = 6;
//        int[] board = {1,2,3,4};
//        int b = 4;
//        int[] board = {1,99999};
//        int b = 2;
        int[] board = {2,5,2};
        int b = 2;
        Solution solution = new Solution();
        System.out.println(solution.solution(b,board));
    }
}
