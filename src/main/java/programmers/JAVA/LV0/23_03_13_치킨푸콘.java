class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        int chickens = chicken;
        int coupon = 0;
        while(true){
            rest = chickens / 10;
            answer += rest;
            
            chickens = chickens%10 + rest;
            
            if(chickens<10){
                break;
            }
        }
        return answer;
    }
}
