import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);

        List<Integer> box = new ArrayList<>();

        int min = arr[0];
        int count = arr[arr.length-2];

        while (true) {
            if (arr[arr.length - 1] % count != 0) {

            }

            break;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

//        int [] a = {2, 6, 8, 14};
//        int [] a = {12, 32, 45, 67, 72};
//        int [] a = {5,10,15,20,25};
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Solution solution = new Solution();
        System.out.println(solution.solution(a));

    }
}
