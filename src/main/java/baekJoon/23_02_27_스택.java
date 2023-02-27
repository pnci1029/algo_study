package com.example.tdd_prac;

import java.io.*;
import java.util.*;

public class BackJoon {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        while (scanner.hasNext()) {
            String value = scanner.nextLine();
            if (value.contains("push")) {
                String push = value.replace("push ", "");
                stack.push(Integer.valueOf(push));
            } else if (value.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (value.equals("size")) {
                System.out.println(stack.size());
            } else if (value.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (value.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")) {
                st.push(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("pop")) {
                if(st.empty()) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(st.pop()+"\n");
                }
            }
            else if(s[0].equals("size")) {
                bw.write(st.size()+"\n");
            }
            else if(s[0].equals("empty")) {
                if(st.empty()) {
                    bw.write(1+"\n");
                }
                else {
                    bw.write(0+"\n");
                }
            }
            else if(s[0].equals("top")) {
                if(st.empty()) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(st.peek()+"\n");
                }
            }
        }
        bw.flush();

    }



}

