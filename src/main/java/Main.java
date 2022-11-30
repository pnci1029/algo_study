import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer,Integer> hashmap = new HashMap<>();

        for (int i : array) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }
        System.out.println("hashmap = " + hashmap);

        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (Integer value : hashmap.values()) {
            if (value > count) {
                count = value;
            }
        }
        System.out.println("count = " + count);

        int numb = 0;
        for (Integer integer : hashmap.keySet()) {
            if (count == hashmap.get(integer)) {
                numb++;
                list.add(integer);
            }
        }

        if (numb>1) {
            return -1;
        } else {
            return list.get(0);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        int[] a = {2};


        Solution solution = new Solution();
        System.out.println(solution.solution(a));
    }
}
