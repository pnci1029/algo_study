//class Solution {
//    public boolean solution(String s) {
//        boolean answer = true;
//
//        char[] chars = s.toCharArray();
//
//        if(!(chars.length==6 || chars.length==4)){
//            return false;
//        }
//        for(int i =0; i<chars.length; i++){
//            if(!(chars[i]>='0' && chars[i]<='9')){
//                return false;
//            }
//        }
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        int a= 10;
//        int b = 3;
//        int c = 2;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b,c));
//    }
//}
