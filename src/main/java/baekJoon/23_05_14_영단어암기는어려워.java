package com.example.tdd_prac;

/**
 * 7 4
 * apple
 * ant
 * sand
 * apple
 * append
 * sand
 * sand
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String[] s = sc.nextLine().split(" ");
//        int left = Integer.parseInt(s[0])-1;
//        int right = Integer.parseInt(s[1]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String value = br.readLine();
            if (value.length() >= m) {
                map.put(value, map.getOrDefault(value, 0)+1);
            }
        }
        List<String> box = new ArrayList<>(map.keySet());

        box.sort((o1, o2) -> {
            int c1=map.get(o1);
            int c2=map.get(o2);

            if(c1==c2){
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length()-o1.length();
            }
            return c2-c1;
        });
        StringBuilder sb = new StringBuilder();
        for (String s1 : box) {
            sb.append(s1).append("\n");
        }
        System.out.println(sb);
    }
}
