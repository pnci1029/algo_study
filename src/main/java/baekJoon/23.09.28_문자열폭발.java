package com.example.tdd_prac;

import java.util.*;

/**
 mirkovC4nizCC44
 C4

 */

public class BackJoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.next();
        String bomb = in.next();
        int textLength = text.length();
        int bombLength = bomb.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < textLength; i++) {
            int count = 0;
            stack.push(text.charAt(i));

            if (stack.size() >= bombLength) {
                for (int j = 0; j < bombLength; j++) {
                    if (stack.get(stack.size() - bombLength +j) == bomb.charAt(j)) {
                        count++;
                        }
                    if (count == bombLength) {
                        for (int a = 0; a < bombLength; a++) {
                            stack.pop();
                        }
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Character character : stack) {
                sb.append(character);
            }
            System.out.println(sb);
        }



//        String text = in.next();
//        String bomb = in.next();
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(text);
////        System.out.println("sb = " + sb);
//
//        while (true) {
//        int count = 0;
//            if (text.contains(bomb)) {
//                count++;
//                text = text.replace(bomb, "");
//            }
//            if (count == 0) {
//                break;
//            }
//        }
////        int index;
////        while ((index = sb.indexOf(bomb)) != -1) {
////            sb.delete(index, index + bomb.length());
////        }
//        if (text.equals("")) {
//            System.out.println("FRULA");
//        } else {
//            System.out.println(text);
////            System.out.println(sb.toString());
//        }


    }
}

