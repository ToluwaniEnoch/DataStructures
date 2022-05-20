package com.data.neetcode150.trees;

public class SubTree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        System.out.println(isSubtree(a, b));
    }

    private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return subRoot == null;
        }


        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);


    }

    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
