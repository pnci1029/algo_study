package com.example.tdd_prac;


class Solution {
    public String generateSequence(int n) {
        if (n == 0) {
            return "1";
        }
        String prev = generateSequence(n - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prev.length(); i++) {
            if (prev.charAt(i) == '1') {
                sb.append("11011");
            } else {
                sb.append("00000");
            }
        }
        return sb.toString();
    }

    /**
     * 위 함수는 n 번째 유사 칸토어 비트열을 문자열로 반환합니다.
     */


    public int countOnes(String sequence, long left, long right) {
        int count = 0;
        for (long i = left - 1; i < right; i++) {
            if (sequence.charAt((int) i) == '1') {
                count++;
            }
        }
        return count;
    }

    /**
     * 위 함수는 문자열 sequence에서 left부터 right까지의 구간 내의 1의 개수를 반환합니다.
     */


    public int solution(int n, long l, long r) {
        String sequence = generateSequence(n);
        return countOnes(sequence, l, r);
    }

    public static void main(String[] args) {

        int a =2;
        long b = 4;
        long c = 17;

        Solution solution2 = new Solution();
        System.out.println(solution2.solution(a,b,c));
    }

}
