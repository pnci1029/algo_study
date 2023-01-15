package com.example.tdd_prac;

import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        String[] split = today.split("\\.");
        Map<String, Integer> map = new HashMap<>();
        int toDate = Integer.parseInt(split[2]);
        int toMonth = Integer.parseInt(split[1]);
        int toYear = Integer.parseInt(split[0]);
//        System.out.println("toYear = " + toYear);
//        System.out.println("toMonth = " + toMonth);
//        System.out.println("toDate = " + toDate);

        for (String term : terms) {
            String[] termSplit = term.split(" ");
            map.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] dateTermSplit = privacies[i].split(" ");
            String termTarget = dateTermSplit[1];
            String[] dateSplits = dateTermSplit[0].split("\\.");

            int month = Integer.parseInt(dateSplits[1]) + map.get(termTarget);
            int date = Integer.parseInt(dateSplits[2]);
            int year = Integer.parseInt(dateSplits[0]);

            while (month > 12) {
                month -= 12;
                year++;
            }
//            System.out.println("year = " + year);
//            System.out.println("month = " + month);
//            System.out.println("date = " + date);
            if (toYear > year) {
                answer.add(i + 1);
            } else if (toYear == year) {
                if (toMonth > month) {
                    answer.add(i + 1);
                } else if (toMonth == month) {
                    if (toDate >= date) {
                        answer.add(i + 1);
                    }
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String a = "2022.05.19";
//        String[] b = {"A 6", "B 12", "C 3"};
//        String[] c = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String a = "2020.01.01";
        String[] b = {"Z 3", "D 5"};
        String[] c = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        List<Integer> result = solution.solution(a, b, c);
        System.out.println("result = " + result);
    }
}
