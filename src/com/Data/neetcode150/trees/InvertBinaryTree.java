package com.Data.neetcode150.trees;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(invertTree(root));
    }

    private static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        return root;
    }
}
