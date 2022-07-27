class Solution {
    public int[] sortedSquares(int[] nums) {
        // Two Poiner Method: O(n)
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        
        // Traverse indices in result array.
        for (int i = right; i >= 0; i--) {
            // Track nums[] with two pointers.
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = nums[right] * nums[right];
                right--;
            } else {
                result[i] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
