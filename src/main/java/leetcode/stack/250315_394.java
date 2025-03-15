not solved
class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder>box = new Stack<>();
        Stack<Integer>numberBox = new Stack<>();
        StringBuilder result = new StringBuilder();

        int number = 0;
        for(char value: s.toCharArray()){
            if(Character.isDigit(value)){
                number = (number * 10) + (value -'0');
            }else if(value == '['){
                numberBox.push(number);
                box.push(result);

                number = 0;
                result = new StringBuilder();
            }else if (value == ']'){
                int count = numberBox.pop();
                StringBuilder word = box.pop();
                for(int i =0; i< count; i++){
                    word.append(result);
                }
                result.append(word);
            }else {
                result.append(value);
            }
        }

        return result.toString();
    }
}
