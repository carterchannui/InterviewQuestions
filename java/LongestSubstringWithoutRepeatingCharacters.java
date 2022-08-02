class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window Approach: O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int right = 0;
        
        int result = 0;
        
        // Slide window.
        while (right < s.length()) {
            char r = s.charAt(right);
            // Add character to hash map.
            map.put(r, map.getOrDefault(r, 0) + 1);
            
            // If the substring contains duplicates, remove left characters from the left until the duplicates are removed.
            while (map.get(r) > 1) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                left++;
            }
            
            // Compare max to current substring length.
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
