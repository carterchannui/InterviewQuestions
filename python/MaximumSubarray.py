class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Utilize DP.
        # Track max possible sum ending at nums[i].
        max_ending_here = nums[0]
        # Track historical max possible contiguous sum from all values produced from max_ending_here.
        max_so_far = nums[0]
        
        # Iterate through the array.
        for i in range(1, len(nums)):
            # Check if max possible sum ending at nums[i] can be acheived by either:
            #   1. Adding nums[i] to current contiguous subarray sum.
            #   2. Ending the current subarray and starting a new one at nums[i].
            max_ending_here = max(max_ending_here + nums[i], nums[i])
            # Compare current max possible sum ending at nums[i] to historical max sum.
            max_so_far = max(max_ending_here, max_so_far)
        # Return.
        return max_so_far
