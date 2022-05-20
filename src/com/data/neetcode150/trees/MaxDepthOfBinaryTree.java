package com.data.neetcode150.trees;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }

    }
}
