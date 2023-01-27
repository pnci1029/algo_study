package com.prepare.pro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int bridgeWeight = 0;
        int bridgeCount = 0;
        Queue<Integer> waitBox = new LinkedList<>();
        Queue<Integer> onBridge = new LinkedList<>();

        List<Integer> box = new ArrayList<>();

        for (int arr : truck_weights) {
            waitBox.offer(arr);
        }

        while (true) {
            answer++;

//            if (onBridge.isEmpty() && !waitBox.isEmpty()) {
//                onBridge.offer(waitBox.peek());
//                bridgeWeight += waitBox.peek();
//                box.add(0);
//            }

            if (!box.isEmpty()) {
                if (box.get(0)== bridge_length-1) {
                    bridgeWeight -= onBridge.peek();
                    onBridge.poll();
                    box.remove(0);

//                if (onBridge.isEmpty()) {
//                    if (!waitBox.isEmpty()) {
//                        bridgeWeight += waitBox.peek();
//                    }
//                    onBridge.offer(waitBox.peek());
//                    box.add(0);
//                }
                }
            }
            if (!onBridge.isEmpty()) {
                for (int i = 0; i < box.size(); i++) {
                    box.set(i, box.get(i) + 1);
                }
            }
            if (!waitBox.isEmpty()) {
                if (waitBox.peek() + bridgeWeight <= weight) {
                   bridgeWeight += waitBox.peek();
                   onBridge.offer(waitBox.poll());
                   box.add(0);

               }
            }
//            if (weight >= bridgeWeight) {
//                if (!waitBox.isEmpty()) {
//                    bridgeWeight += waitBox.peek();
//                    onBridge.offer(waitBox.poll());
//                    box.add(0);
//                }
//            }

            if (onBridge.isEmpty() && waitBox.isEmpty()) {
                break;
            }



//            System.out.println("box = " + box);
//            System.out.println("waitBox = " + waitBox);
//            System.out.println("onBridge = " + onBridge);
//            System.out.println("answer = " + answer);
//            System.out.println("==============");

        }


        return answer;
    }

    public static void main(String[] args) {

        int a =  100;
        int b = 100;
        int[] box = {10,10,10,10,10,10,10,10,10,10};
        Solution solution = new Solution();
        int result = solution.solution(a, b, box);
        System.out.println("result = " + result);
    }

}
