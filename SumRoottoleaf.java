class Solution {
    int result;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int curr) {
        // base
        if (root == null)
            return;

        // logic
        helper(root.left, curr * 10 + root.val);
        if (root.left == null && root.right == null) {
            result += curr * 10 + root.val;
        }
        helper(root.right, curr * 10 + root.val);
    }
}