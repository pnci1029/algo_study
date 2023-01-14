package com.example.tdd_prac;

import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String [files.length];
        String[][] arr = new String[files.length][3];
        Map<String, List<String>> map = new HashMap<>();
        for (int j =0; j< files.length; j++) {
            List<String> box = new ArrayList<>();
            char[] chars =  files[j].toCharArray();
            String head = "";
            String numb = "";
            String tail = "";
            int numberCount = 0;
            int tailCount = 0;
            for (int i = 0; i < chars.length; i++) {
                boolean isNumb = chars[i] >= '0' && chars[i] <= '9';
                if (isNumb && numberCount==0) {
                    numberCount = i;
                }
                if (!isNumb && numberCount>0) {
                    tailCount = i;
                    break;
                }
            }
//            System.out.println("numberCount = " + numberCount);
//            System.out.println("tailCount = " + tailCount);
            if (tailCount == 0) {
                tailCount = chars.length - 1;
                head = files[j].substring(0, numberCount);
                numb = files[j].substring(tailCount);
                tail = "";
            } else {
                head = files[j].substring(0, numberCount);
                numb = files[j].substring(numberCount, tailCount);
                tail = files[j].substring(tailCount);
            }
            box.add(head);
            box.add(numb);
            box.add(tail);
            arr[j][0] = head;
            arr[j][1] = numb;
            arr[j][2] = tail;
            map.put(files[j], box);
//            System.out.println("head = " + head);
//            System.out.println("numb = " + numb);
//            System.out.println("tail = " + tail);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) > 0){
                return 1;
            }else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) < 0){
                return -1;
            }else{
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])){
                    return 1;
                }else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i][0] + arr[i][1] + arr[i][2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"img12.png", "img10.png1", "img02.png", "img1", "IMG01.GIF", "img2.JPG","img202.png123"};
        String[] solution1 = solution.solution(a);
        System.out.println(Arrays.toString(solution1));

    }
}
