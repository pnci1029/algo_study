import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Map<String,Integer>map = new HashMap<>();

        Arrays.sort(spell);
        for(int i =0; i<dic.length; i++){
            String[] value = dic[i].split("");
            Arrays.sort(value);
            if(value.length == spell.length){
                int count = 0;
                for(int j =0; j<spell.length; j++){
                    if(spell[j].equals(value[j])){
                        count++;
                    }
                }
                if(count == spell.length){
                    return 1;
                }
            }
            if(spell.equals(value)){
                answer++;
            }
        }
        
        return 2;
    }
}
