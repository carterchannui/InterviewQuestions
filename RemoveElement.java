class Solution {
    public int removeElement(int[] nums, int val) {
        // Distance between current element and target position.
        int dist = 0;
        // Frequency of target value.
        int num_vals = 0;
        // Traverse backwards through the array.
        for (int i = nums.length - 1; i >= 0; i--) {
            // Check if current element equals target.
            if (nums[i] == val) {
                // Move element to target position.
                nums[i] = nums[i + dist];
                nums[i + dist] = val;
                num_vals++;
            } else {
                dist++;
            }
        }
        return nums.length - num_vals;
    }
}
