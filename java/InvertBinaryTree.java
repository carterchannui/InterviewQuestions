class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base case.
        if (root == null) {
            return root;
        } else {
            // Recusive calls get information.
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
           
            // Use recursive information to perform task.
            root.left = right;
            root.right = left;
            
            // Return query.
            return root;
        }
    }
}
