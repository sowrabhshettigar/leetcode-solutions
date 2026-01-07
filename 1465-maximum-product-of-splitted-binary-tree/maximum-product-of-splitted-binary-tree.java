class Solution {

    long totalSum = 0;
    long maxProduct = 0;

    public int maxProduct(TreeNode root) {

        totalSum = getSum(root);

        calculate(root);

        return (int) (maxProduct % 1_000_000_007);
    }

    private long getSum(TreeNode node) {
        if (node == null)
            return 0;

        return node.val + getSum(node.left) + getSum(node.right);
    }

    private long calculate(TreeNode node) {
        if (node == null)
            return 0;

        long leftSum = calculate(node.left);
        long rightSum = calculate(node.right);

        long subTreeSum = node.val + leftSum + rightSum;

        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}
