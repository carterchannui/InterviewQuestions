class Solution {
    public int minDepth(TreeNode root) {
        // Base case.
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            // Get depth of left and right.
            int depth1 = minDepth(root.left) + 1;
            int depth2 = minDepth(root.right) + 1;
            
            return Math.min(depth1, depth2);
        }
    }
}
