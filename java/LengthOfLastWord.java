class Solution {
    public int lengthOfLastWord(String s) {
        // Tokenize string.
        String[] words = s.split(" ");
        // Return length of last word.
        return words[words.length - 1].length();
    }
}
