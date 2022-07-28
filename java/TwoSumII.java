class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Brute Force: O(n^2)
        /*
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (j == i) {
                    j++;
                } else if (numbers[j] == complement) {
                    if (j > i) {
                        int temp = i;
                        i = j;
                        j = temp;
                    }
                    return new int[]{j + 1, i + 1};
                }
            }
        }
        return null;
        */
        
        // One pass: O(n)
        int left = 0;
        int right = numbers.length - 1;
        
        // Take advantage of the array being sorted.
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target)  {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }
}
