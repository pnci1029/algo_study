package com.example.tdd_prac;

import java.sql.Statement;
import java.util.*;

/**
 * 150
 * 266
 * 427
 */
public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(in.next());
        }

        List<String> resultBox = new ArrayList<>();
        for (String s : arr) {
            Stack<String> stack = new Stack<>();
            int compare = 0;

            String[] split = s.split("");
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("(")) {
                    stack.push("(");
                } else {
                    if (stack.isEmpty()) {
                        resultBox.add("NO");
                        compare = 1;
                        break;
                    }
                    stack.pop();
                }
            }

            if (compare != 1) {
                if (stack.isEmpty()) {
                    resultBox.add("YES");
                } else {
                    resultBox.add("NO");
                }
            }

        }
        for (String box : resultBox) {
            System.out.println(box);
        }


    }

}
