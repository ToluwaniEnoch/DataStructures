package com.data.neetcode150.trees;

public class LowestCommonAncestor {
    public static void main(String[] args) {

        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();

        System.out.println(findLowestCommonAncestor(a, b, c));
    }

    private static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val){
            return findLowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
            return findLowestCommonAncestor(root.right, p, q);
        }else return root;
    }
}
