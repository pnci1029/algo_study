v2
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        String [] split = s.split("");

        for(char value: s.toCharArray()){
            if(value == '*'){
                stack.pop();
            }else {
                stack.push(value);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char value: stack){
            sb.append(value);
        }

        return sb.toString();
    }
}

v1
class Solution {
    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        String [] split = s.split("");
        String result = "";

        for(String value : split){
            if(value.equals("*")){
                result += stack.pop();
            }else {
                stack.add(value);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String value: stack){
            sb.append(value);
        }

        return sb.toString();
    }
}
