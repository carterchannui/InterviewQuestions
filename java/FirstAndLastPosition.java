class Solution {
    public int[] searchRange(int[] nums, int target) {
        // [5, 5, 6, 6, 7, 8, 9] 
        
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findSecond(nums, target);
        return result;
    }
    
    public int findFirst(int[] nums, int target) {
        int idx = -1;
        int mid;
        int high = nums.length - 1;
        int low = 0;
        
        // Binary Search
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                // Instead of returning the index:
                // Update the current index and search left of the first contact.
                // All occurences of the target MUST exist within the current bounds.
                idx = mid;
                high--;
            }
        }
        return idx;
    }
    
    public int findSecond(int[] nums, int target) {
        int idx = -1;
        int mid;
        int high = nums.length - 1;
        int low = 0;
        
        // Binary Search
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                // Instead of returning the index:
                // Update the current index and search right of the first contact.
                idx = mid;
                low++;
            }
        }
        return idx;
    }
    
}
