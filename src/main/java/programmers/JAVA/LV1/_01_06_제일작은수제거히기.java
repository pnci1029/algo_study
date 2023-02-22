package com.prepare.pro;
import java.util.*;
public class Solution {
        public List<Integer> solution(int[] arr) {
            int[] answer = {};
            List<Integer> box = new ArrayList<>();
            int min = arr[0];
            for (Integer integer : arr) {
                if (integer <= min) {
                    min = integer;
                }
            }
            Arrays.sort(arr);
            if (arr.length == 1) {
                box.add(-1);
                return box;
            } else {
                for (int i = arr.length-1; i >=0; i--) {
                    if (arr[i] != min) {
                    box.add(arr[i]);
                    }
                }
            }

            return box;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] aa = {4, 3, 2, 1,1,2,5};
        List<Integer> result = solution.solution(aa);
        System.out.println("result = " + result);
    }
}
