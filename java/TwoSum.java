class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force O(n^2):
        /*
        int[] indices = new int[2];
        // This implementation does not double count.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
        */

        // Two Pass O(n):
        HashMap<Integer, Integer> vals = new HashMap<>();
        // Add items to hashmap.
        for (int i = 0; i < nums.length; i++) { 
            vals.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int[] result = new int[2];
            // Ensure that the complement is not nums[i] itself.
            if (vals.containsKey(target - nums[i]) && vals.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = vals.get(target - nums[i]);
                return result;
            }
        }
        return null;
    }
}
