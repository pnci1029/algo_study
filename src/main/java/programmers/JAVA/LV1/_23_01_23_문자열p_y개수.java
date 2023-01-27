//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int pCount =0;
//        int yCount = 0;
//
//        String []value = s.split("");
//        for(int i =0; i<value.length; i++){
//            if(value[i].equals("P") || value[i].equals("p")){
//                pCount++;
//            }else if(value[i].equals("Y") || value[i].equals("y")){
//                yCount++;
//            }
//        }
//        if(pCount == yCount){
//            return true;
//        }
//        return false;
//    }
//}