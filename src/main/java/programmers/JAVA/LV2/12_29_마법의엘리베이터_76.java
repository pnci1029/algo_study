package com.prepare.pro;

class Solution {
    /*
    2554
     */
    public int solution(int storey) {
        int answer = 0;
        int idx = storey;

        while (true) {
            System.out.println("idx = " + idx);
            int nam = idx;
            if (storey >= 10) {
                nam = idx % 10;
                if (nam >= 6) {
                    idx += 10;
                    answer += 10 - nam;
                } else {
                    answer += nam;

                }
            } else if (storey >= 6) {
                answer = 1 + 10 - storey;
                break;
            } else {
                answer = storey;
                break;
            }

            idx = idx / 10;
            if (idx == 0) {
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(666);
        System.out.println(solution1);
    }
}


