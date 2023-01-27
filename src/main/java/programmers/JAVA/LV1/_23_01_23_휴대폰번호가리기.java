//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        int length = phone_number.length();
//
//        String [] numb = phone_number.split("");
//        for(int i =0; i<numb.length; i++){
//            if(i<numb.length-4){
//                answer += "*";
//            }else
//                answer += numb[i];
//
//        }
//
//        return answer;
//    }
//}