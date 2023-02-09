class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String word = A;
        System.out.println(word.substring(word.length()-1));
        if(A.equals(B)){
            return 0;
        }
        int count = 0;
        while(true){
            word = word.substring(word.length()-1)+word.substring(0,word.length()-1);
            System.out.println(word);
            count++;
            if(word.equals(B) ){
                break;
            }
            if(count >A.length()){
                return -1;
            }
        }
        
        
        return count;
    }
}
