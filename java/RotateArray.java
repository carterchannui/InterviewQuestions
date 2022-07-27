class Solution {
    public void rotate(int[] nums, int k) {
        // Using Extra Array Method: O(n)
        int n = nums.length;
        int[] res = new int[n];
        
        // Use modulo to calculate new index.
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        
        // Copy res[] to nums[].
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}
