class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        # Implement Binary Search.
        low = 0
        high = len(nums) - 1
        
        while low <= high:
            mid = low + (high - low) // 2
            # Locate the half of the array that the target exist within.
            if nums[mid] > target:
                high = mid - 1
                # Check if target falls outside bounds (target is smaller than all array elements).
                if low > high:
                    # Return target's expected position (first index).
                    return low
            elif nums[mid] < target:
                low = mid + 1
                # Check if target falls outside bounds (target is larger than all array elements).
                if low > high:
                    # Return target's expected position (last index).
                    return low
                # Locate target's expected position (target does not exist within array).
                elif low == high and nums[low] > target:
                    # Return target's expected position ()
                    return low
            elif target == nums[mid]:
                return mid
