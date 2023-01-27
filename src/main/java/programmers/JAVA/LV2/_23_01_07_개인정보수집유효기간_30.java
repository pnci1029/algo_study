package com.prepare.pro;
import java.util.*;
public class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> box = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        String[] split = today.split("\\.");
        int compYear = Integer.parseInt(split[0]);
        int compMonth = Integer.parseInt(split[1]);
        int compDat = Integer.parseInt(split[2]);

//        System.out.println("compYear = " + compYear);
//        System.out.println("compMonth = " + compMonth);
//        System.out.println("compDat = " + compDat);

        for (int i = 0; i < terms.length; i++) {
            String[] s = terms[i].split(" ");
            map.put(s[0], Integer.valueOf(s[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            int idx = 0;
            int mapNum = map.get(s[1]);

            String[] value = s[0].split("\\.");
            if (mapNum+Integer.parseInt(value[1]) > 12) {
                idx = (Integer.parseInt(value[1])+mapNum) / 12;
            }
            if (Integer.parseInt(value[1]) + mapNum > 12) {
                value[0] = String.valueOf(Integer.parseInt(value[0]) + idx);
                value[1] = String.valueOf((Integer.parseInt(value[1])+mapNum)%12);
                if ((compYear == Integer.parseInt(value[0]))) {
                    if (compMonth == Integer.parseInt(value[1])) {
                        if (compDat == Integer.parseInt(value[2])) {
                            box.add(i + 1);
                        } else if (compDat > Integer.parseInt(value[2])) {
                            box.add(i + 1);
                        } else {
                            continue;
                        }
                    } else if (compMonth > Integer.parseInt(value[1])) {
                        box.add(i + 1);
                    } else {
                        continue;
                    }
                } else {
                    box.add(i + 1);
                }
//                System.out.println("value[0] = " + value[0]);
//                System.out.println("value[1] = " + value[1]);
//                System.out.println("value[2] = " + value[2]);
//                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

            } else {
                value[1] = String.valueOf(Integer.parseInt(value[1])+mapNum);

                if ((compYear == Integer.parseInt(value[0]))) {
                    if (compMonth == Integer.parseInt(value[1])) {
                        if (compDat == Integer.parseInt(value[2])) {
                            box.add(i + 1);
                        } else if (compDat > Integer.parseInt(value[2])) {
                            box.add(i + 1);
                        } else {
                            continue;
                        }
                    } else if (compMonth > Integer.parseInt(value[1])) {
                        box.add(i + 1);
                    } else {
                        continue;
                    }
                } else {
                    box.add(i + 1);
                }
//                System.out.println("value[0] = " + value[0]);
//                System.out.println("value[1] = " + value[1]);
//                System.out.println("value[2] = " + value[2]);
//                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            }

        }

        System.out.println("map = " + map);

        return box;
    }

    public static void main(String[] args) {
//        String a = "2022.05.19";
//        String[] b = {"A 6", "B 12", "C 3"};
//        String[] c = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
//        String a = "2022.02.28";
//        String[] b = {"A 23"};
//        String[] c = {"2020.01.28 A"};
        String a = "2020.01.01";
        String[] b = {"Z 3", "D 5"};
        String[] c = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        Solution solution = new Solution();
        List<Integer> solution1 = solution.solution(a, b, c);
        System.out.println("solution1 = " + solution1);
    }
}
