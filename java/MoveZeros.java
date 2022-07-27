class Solution {
    public void moveZeroes(int[] nums) {
        // Two Pointer Technique: O(n)
        
        // Use pointer to track lowest-index zero.
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[pointer] == 0) {
                nums[pointer] = nums[i];
                nums[i] = 0;
                pointer++;
            } else if (nums[pointer] !=0) {
                pointer++;
            }
        }
    }
}
