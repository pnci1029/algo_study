package com.example.tdd_prac;


import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int numb = 0;
        for (int i : section) {
            if (i > numb) {
                numb = m + i - 1;
                answer++;
            }
        }


//        if (section.length == 1) {
//            return 1;
//        } else if (m == 1) {
//            return section.length;
//        } else {
//            int length = section[0]-1;
//            while (true) {
//                length += m;
//                answer++;
//                if (length >= section[section.length - 1]) {
//                    break;
//                }
//            }
//        }



        return answer;
    }

    public static void main(String[] args) {

//        int a = 8;
//        int b = 4;
//        int[] c = {2, 3, 6};
        int a = 5;
        int b = 4;
        int[] c = {1,3};

//        int a = 4;
//        int b = 1;
//        int[] c = {1,2,3,4};

        Solution solution2 = new Solution();
        System.out.println(solution2.solution(a,b,c));
    }

}
