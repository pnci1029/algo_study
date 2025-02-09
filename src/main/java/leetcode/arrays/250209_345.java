class Solution {
    public String reverseVowels(String s) {
        String[] isVowels = {"a", "e", "i", "o", "u","A", "E", "I", "O", "U"};

        List<String> vowelList = new ArrayList<>();

        String[] split = s.split("");
        int vowelCount = 0;

        for (int i = 0; i < split.length; i++) {
            for (String isVowel : isVowels) {
                if (split[i].equals(isVowel)) {
                    vowelCount++;
                    vowelList.add(split[i]);
                }
            }
        }
        Collections.reverse(vowelList);

        int index = 0;
        for (int i = 0; i < split.length; i++) {
            for (String isVowel : isVowels) {
                if (split[i].equals(isVowel)) {
                    split[i] = vowelList.get(index);
                    index++;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String string : split) {
            sb.append(string);
        }

        return sb.toString();
    }
}
