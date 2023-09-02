import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int count = 0;
        
        for(int i =0; i<db.length; i++){
            for(int j =0; j<db[i].length; j++){
                if(db[i][0].equals(id_pw[0])){
                    if(db[i][1].equals(id_pw[1])){
                        return "login";
                    }else{
                        answer = "wrong pw";
                        count++;
                    }
                }else{
                    answer = "fail";
                }
            }
        }
        if(count >=1){
            return "wrong pw";
        }
        return answer;
    }
}
