package com.example.tdd_prac;

import java.util.*;

/**
 *
 5 11
 baekjoononlinejudge
 startlink
 codeplus
 sundaycoding
 codingsh
 baekjoon
 codeplus
 codeminus
 startlink
 starlink
 sundaycoding
 codingsh
 codinghs
 sondaycoding
 startrink
 icerink
 */


public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int target = in.nextInt();
        int values = in.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < target; i++) {
            String data = in.next();
            map.put(data, 0);
        }
        int result = 0;
        for (int i = 0; i < values; i++) {
            String data = in.next();
            if (map.containsKey(data)) {
                result++;
            }
        }
        System.out.println(result);



    }


    
}
