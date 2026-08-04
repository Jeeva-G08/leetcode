class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {

            String text = "";
            int index = 0;

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (Character.isDigit(ch)) {
                    index = ch - '1';
                } else {
                    text += ch;
                }
            }

            result[index] = text;
        }

        return String.join(" ", result);
    }
}