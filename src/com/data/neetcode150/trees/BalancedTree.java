package com.data.neetcode150.trees;

public class BalancedTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        return (Math.abs(calculateHeight(root.left) - calculateHeight(root.right)) <= 1
                && isBalanced(root.right) && isBalanced(root.left));

    }

    public static int calculateHeight(TreeNode root){
        if(root == null) return 0;

        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);

        return 1 + Math.max(left, right);
    }
}
