v2
class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stringBox = new Stack<>();
        Stack<Integer> numberBox = new Stack<>();
        
        int currentNumber = 0;
        StringBuilder result = new StringBuilder();

        for(char value: s.toCharArray()){
            // System.out.println(stringBox);
            if(Character.isDigit(value)){
                currentNumber = currentNumber * 10 + (value - '0');
            }else if(value =='['){
                numberBox.push(currentNumber);
                stringBox.push(result);
                result = new StringBuilder();
                currentNumber = 0;
            }else if(value == ']'){
                System.out.println("stringBox : "+stringBox);
                int number = numberBox.pop();
                StringBuilder text = stringBox.pop();
                
                System.out.println("number : "+number);
                System.out.println("text : "+text);
                for(int i =0; i<number; i++){
                    text.append(result);
                }
                result = text;
            }else {
                System.out.println("value : "+value);
                result.append(value);
            }

        }

        return result.toString();
    }
}

v1
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
                result = word;
            }else {
                result.append(value);
            }
        }

        return result.toString();
    }
}

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
