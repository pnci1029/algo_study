class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");

        List<String> box = new ArrayList<>();

        for(int i=0; i<split.length; i++){
            if(!split[i].equals(""))box.add(split[i]);
        }
        StringBuilder answer = new StringBuilder();


        for(int i =box.size() -1 ; i>=0; i--){
            answer.append(box.get(i));

            if(i !=0){
                answer.append(" ");
            }

        }


        return answer.toString();
    }
}
