import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        String[] answer = new String[picture.length];

        List<String> box = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String[] split = picture[i].split("");
            String value = "";
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("x")) {
                    for (int b = 0; b < k; b++) {
                        value += "x";
                    }
                } else {
                    for (int b = 0; b < k; b++) {
                        value += ".";
                    }
                }
            }
            for (int a = 0; a < k; a++) {
                box.add(value);
            }
        }
//        "..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"
//        ".xxxx...xxxx., .xxxx...xxxx., xx..xx.xx..xx, xx..xx.xx..xx, xx...xx...xx, xx...xx...xx, .xx.....xx., .xx.....xx., ..xx...xx.., ..xx...xx.., ...xx.xx..., ...xx.xx..., ....xx...., ....xx...."
        return box;
    }
}
