package com.example.vargenerator.api.controller;

import java.util.*;

/**
   baekjoon online judge

   <open>tag<close>

   <int><max>2147483647<long long><max>9223372036854775807
   <p>
   <ab cd>ef gh<ij kl>
  */
// https://www.acmicpc.net/problem/14916
public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        List<String> result = new ArrayList<>();

        if (value.contains("<")) {
            String[] splitValue = value.split("");

            boolean isStarted = false;
            String data = "";
            String remainedData = "";
            for (String s : splitValue) {
                if (s.equals("<")) {
                    isStarted = true;

                    remainedData = remove(remainedData);
                    if (!remainedData.equals("")) {
                        result.add(normalSplit(remainedData).trim());
                        remainedData = "";
                    }
                }

                if (s.equals(">")) {
                    isStarted = false;
                    data += ">";
                    result.add(data);
                    data = "";
                }

                if (isStarted) {
                    data += s;
                } else {
                    remainedData += s;
                }
            }
            if (!remainedData.equals("")) {
                remainedData = remove(remainedData);
                result.add(normalSplit(remainedData));
            }

            for (String s : result) {
                value = value.replace(s, "");
            }

            StringBuilder sb = new StringBuilder();
            for (String s : result) {
                sb.append(s);
            }

            System.out.println(sb.toString().trim());
        } else {
            System.out.println(normalSplit(value).trim());
            ;
        }

    }

    private static String normalSplit(String value) {
        String[] split = value.split(" ");
        List<String> result = new ArrayList<>();

        for (String s : split) {
            String[] split1 = s.split("");
            String data = "";
            for (int i = split1.length - 1; i >= 0; i--) {
                data += split1[i];
            }
            result.add(data);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }

    private static String remove(String value) {
        value = value.replace(">", "");
        value = value.replace("<", "");
        return value;
    }
}
