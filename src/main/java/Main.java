import java.util.*;

class Solution {
    public List<String> solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings);

        List<Character> box = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            box.add(strings[i].charAt(n));
        }

        Collections.sort(box);

        List<String> result = new ArrayList<>();

        for (Character character : box) {
            for (int i =0; i< strings.length; i++) {
                if (strings[i].charAt(n) == character && !result.contains(strings[i])) {
                    result.add(strings[i]);
                }
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
//        String[] string = {"sun", "bed", "car"};
        String[] string = {"abce", "abcd", "cdx"};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.solution(string, n));
    }
}
