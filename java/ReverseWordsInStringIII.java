class Solution {
    public String reverseWords(String s) {
        // Iterate over string.
        // Utilize StringBuilder since .append() is O(1) and normal concatenation += is O(n).
        StringBuilder result = new StringBuilder();
        
        int lastSpaceIdx = -1;
        
        // Iterate over string s.
        for (int strIdx = 0; strIdx < s.length(); strIdx++) {
            if (s.charAt(strIdx) == ' ' || strIdx == s.length() - 1) {
                // Reverse substring s[lastSpaceIdx + 1, spaceIdx - 1].
                int end = (strIdx == s.length() - 1) ? strIdx : strIdx - 1;
                
                // Append characters in reverse order to result String.
                for (int j = end; j > lastSpaceIdx; j--) {
                    result.append(s.charAt(j));
                }
                
                // Add space.
                if (s.charAt(strIdx) == ' ') {
                    result.append(' ');
                }
                
                // Convert StringBuilder to String.
                lastSpaceIdx = strIdx;
            }
        }
        return new String(result);
    }
}

