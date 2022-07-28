class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap Approach: O(n)
        
        if (s.length() != t.length()) {
            return false;
        }
        
        // Add letter frequencies to HashMap.
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        // Compare frequencies.
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) >= 1) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
