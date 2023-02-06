package com.example.tdd_prac;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";


        int a = 0;
        while (true) {

            String value = Integer.toString(a,n).toUpperCase();
            answer += value;
            a++;
            if (answer.length()>=t*m) {
                break;
            }
        }

        int count = 1;
        String result = "";
        for (int i = 0; i < answer.length(); i++) {

            if (count == p) {
                result += answer.split("")[i];
            }
            if (result.length() == t) {
                break;
            }

            count++;
            if (count > m) {
                count = 1;
            }
        }

        System.out.println("result = " + result);
        return result;
    }

    /**
     * root / abcd / etc
     * root / cd / solution / test
     * @param args
     */
    public static void main(String[] args) {
        Solution solution2 = new Solution();
        solution2.solution(16, 16, 2, 1);}
}
