package ch;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int compress(char[] chars) {
        List<String> box = new ArrayList<>();

        char currentType = chars[0];
        int count = 1;
        for(int i =1; i<chars.length; i++){
            if(chars[i] == currentType){
                count++;
            }else {
                box.add(String.valueOf(currentType));
                if(count > 1){
                    String countStr = String.valueOf(count);
                    for(char c : countStr.toCharArray()) {
                        box.add(String.valueOf(c));
                    }
                }

                count = 1;
                currentType = chars[i];
            }
        }

        box.add(String.valueOf(currentType));
        if(count >1){
            String countStr = String.valueOf(count);
            for(char c : countStr.toCharArray()) {
                box.add(String.valueOf(c));
            }
        }
        System.out.println(box);

        for(int i = 0; i < box.size(); i++) {
            chars[i] = box.get(i).charAt(0);
        }

        return box.size();
    }
}
