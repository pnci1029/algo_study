package com.prepare.pro;

public class Solution {
    public int solution(int storey) {
        int answer = 0;
        int idx = storey;

        while (true) {
            int nam = idx;
            int count = nam;
            if (storey >= 10) {
                nam = idx % 10;
                if (nam >= 6) {
                    idx += 10;
                    answer += 10 - nam;
                } else if (nam == 5) {
                    if (count >= 10) {
                        if (count / 10 % 10 >= 5) {
                            idx += 10;
                            answer += 10 - nam;
                        } else {
                            answer += nam;
                        }
                    } else {
                        answer += nam;
                    }
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
        int solution1 = solution.solution(54);
        System.out.println("solution1 = " + solution1);
    }
}
