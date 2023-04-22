import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer,Boolean>map = new HashMap<>();
        Map<Integer,Integer>box = new HashMap<>();
        for(int i =0; i<rank.length; i++){
            map.put(rank[i],attendance[i]);
            box.put(rank[i],i);
        }
        
        int first = 0;
        int second = 0;
        int third = 0;
        
        int count = 0;
        for(int i =1;i <map.size()+1; i++){
            if(map.get(i)){
                if(count ==0){
                    first = i;
                }else if(count ==1){
                    second = i;
                }else if(count ==2){
                    third = i;
                }
                count++;
            }
        }
        
        //System.out.println(map);
        answer += (box.get(first)*10000)+ (box.get(second)*100) + box.get(third);
        
        return answer;
    }
}
