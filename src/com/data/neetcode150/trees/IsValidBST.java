package com.data.neetcode150.trees;

public class IsValidBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(isValidBinaryST(root));
    }

    private static boolean isValidBinaryST(TreeNode root) {
        return validate(root, null, null);

    }

    public static boolean validate(TreeNode root, Integer max, Integer min){
        if(root == null) {
            return true;
        }else if(max != null && root.val >= max || min != null && root.val <= min ){
            return false;
        }
        return validate(root.left, root.val, min) && validate(root.right, max, root.val);

    }
}
