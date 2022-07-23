class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # The set() constructor will remove duplicates.
        if len(nums) != len(set(nums)):
            return True
        return False
