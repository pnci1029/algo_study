package com.example.tdd_prac;

import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> a = new LinkedList<>();
        Queue<String> b = new LinkedList<>();
        Queue<String> c = new LinkedList<>();

        for (String s : cards1) {
            a.add(s);
        }
        a.add("asdfsadfa");
        for (String s : cards2) {
            b.add(s);
        }
        b.add("asdfsadf");
        for (String s : goal) {
            c.add(s);
        }

        int count = 0;
        while (true) {
            if (a.peek().equals(c.peek())) {
                a.poll();
                c.poll();
            } else if (b.peek().equals(c.peek())) {
                b.poll();
                c.poll();
            }
            if (c.isEmpty()) {
                return "Yes";
            }
//            if ((a.isEmpty() && !b.isEmpty())||(!a.isEmpty() && b.isEmpty())) {
//                return "No";
//            }
            count++;
            if (count > cards1.length + cards2.length) {
                break;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        String[] a = {"i", "drink", "water"};
        String[] b = {"want", "to"};
        String[] c = {"i", "want", "to", "drink", "water"};
        Solution solution2 = new Solution();
        System.out.println(solution2.solution(a,b,c));
    }

}
