class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // [1, 2, 3, 0, 0] ... [2, 6]
        int cur = m + n - 1;
        int n1 = m - 1;
        int n2 = n - 1;
        
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] >= nums2[n2]) {
                nums1[cur] = nums1[n1];
                n1--;
                cur--;
            } else {
                nums1[cur] = nums2[n2];
                n2--;
                cur--;
            }
        }
        
        // Account for the scenario where nums2 is larger than nums1
        while (n2 >= 0) {
            nums1[cur] = nums2[n2];
            cur--;
            n2--;
        }
    }
}
