package com.example.tdd_prac;


import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        char[] target = s.toCharArray();
        char[] compare = skip.toCharArray();

        List<Character> box = new ArrayList<>();
        for (char c : compare) {
            box.add(c);
        }
        for(char a : target){
            int count=0;
            for(int i=0;i<index;i++){
                count++;
                if((char)(a+count)>'z'){
                    count-=(char)('z'-'a'+1);
                }
                for (Character character : box) {
                    if ((char) (a + count) == character) {
                        i--;
                    }
                }
            }
            answer+=(char)(a+count);
        }


        return answer;
    }

    public static void main(String[] args) {

//        String a= "aukks";
//        String b = "wbqd";
//        int c = 5;
//        String a = "xyzabc";
//        String b = "yzabcd";
//        int c = 1;
        String a = "ybcde";
        String b = "az";
        int c =1;
        Solution solution = new Solution();
        String solution1 = solution.solution(a,b,c);
        System.out.println("solution1 = " + solution1);
    }
}
