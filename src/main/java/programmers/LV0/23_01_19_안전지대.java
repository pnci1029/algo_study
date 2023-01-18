 class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] result = new int[board.length ][board[0].length];
        int[] box = new int[board[0].length - 1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    result[i][j] = 1;
                    if (j != 0) {
                        result[i][j - 1] = 1;
                    }
                    if (j != board[i].length - 1) {
                        result[i][j + 1] = 1;
                    }
                    if (i > 0) {
                        result[i-1][j] = 1;
                        if (j != 0) {
                            result[i-1][j - 1] = 1;
                        }
                        if (j != board[i].length - 1) {
                            result[i-1][j + 1] = 1;
                        }
                    }
                    if (i < board[i].length-1) {
                        result[i+1][j] = 1;
                        if (j != 0) {
                            result[i+1][j - 1] = 1;
                        }
                        if (j != board[i].length - 1) {
                            result[i+1][j + 1] = 1;
                        }
                    }
                }

            }
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    answer++;
                }
            }
        }
//        for (int[] ints : result) {
//            System.out.println("ints = " + Arrays.toString(ints));
//        }



        return answer;
    }}
