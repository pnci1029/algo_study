package com.example.tdd_prac;


import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        int[][] myTime = new int[book_time.length][book_time[0].length];

        for (int i =0; i< book_time.length; i++) {
            for (int j = 0; j < book_time[i].length; j++) {
                myTime[i][j] = Integer.parseInt(book_time[i][j].replace(":", ""));
            }
        }
//        for (int[] ints : myTime) {
//            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
//        }

        int time = 2410;
        int[] box = new int[time];
        for (int[] i : myTime) {
            box[i[0]] += 1;
            if (i[1] % 100 >= 51) {
                box[i[1] + 10 + 40] -= 1;
            } else {
                box[i[1]+10] -= 1;
            }
        }
        for (int i = 1; i < time; i++) {
            box[i] += box[i-1];
            answer = Math.max(answer, box[i]);
        }

//        for (int i : box) {
//            System.out.println("i = " + i);
//        }

        return answer;
    }

    public static void main(String[] args) {

//        String[][] a = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
//        String[][] a = {{"09:10", "10:10"}, {"09:10", "10:10"}, {"09:10", "10:10"}};
        String[][] a = {{"09:10", "10:51"},{"11:02", "12:20"}};
        Solution solution = new Solution();
        int solution1 = solution.solution(a);
        System.out.println("solution1 = " + solution1);
    }
}

//        for (int i =0; i< book_time.length; i++) {
//            for (int j = 0; j < book_time[i].length; j++) {
//                myTime[i][j] = Integer.parseInt(book_time[i][j].replace(":", ""));
//            }
//        }
//
//        Arrays.sort(myTime, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }else {
//                    return o1[0] - o2[0];
//                }
//            }
//        });
//
////        for (int[] ints : myTime) {
////            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
////        }
//
//        boolean[] compare = new boolean[myTime.length];
//        for (int i = 0; i < myTime.length-1; i++) {
//            int idx = myTime[i][1];
//            int count = 0;
//            for (int j = i + 1; j < myTime.length; j++) {
//                if (myTime[j][0] >= idx + 10 && !compare[j]) {
//                    compare[j] = true;
//                    idx = myTime[j][1];
//                    count++;
////                    System.out.println("idx = " + idx);
////                    System.out.println("compare = " + Arrays.toString(compare));
//                }
//            }
//            if (count == 0) {
//                answer++;
//            }
//        }
