//class Solution {
//    public boolean solution(int x) {
//        boolean answer = true;
//        int target = 0;
//        int numb = x;
//        while(true){
//            target += numb%10;
//            numb /=10;
//            if(numb<10){
//                target+= numb;
//                break;
//            }
//        }
//        if(x%target==0){
//            return true;
//        }
//        return false;
//    }
//}