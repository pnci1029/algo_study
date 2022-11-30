import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        List<String> box = new ArrayList<>();

        char[] chars = skill.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            box.add(String.valueOf(chars[i]));
        }

        for (String skill_tree : skill_trees) {
            String[] split = skill_tree.split("");

            String result = "";
            String compare = "";

            for (int i = 0; i < split.length; i++) {
                for (String s : box) {
                    if (split[i].equals(s)) {
                        result += split[i];
                        break;
                    }

                }
            }
            if (result.length() != 0) {
                for (int i = 0; i < result.length(); i++) {
                    compare += box.get(i);
                }
            }
            if (result.equals(compare)) {

                answer++;
            }
//            System.out.println("compare = " + compare);
//            System.out.println("result = " + result);
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        String a ="CBD";
        String[] b = {"BACDE", "CBADF", "AECB", "BDA"};

//        String a = "CBD";
//        String[] b = {"CXF", "ASF", "BDF", "CEFD"};


        Solution solution = new Solution();
        System.out.println(solution.solution(a,b));
    }
}
