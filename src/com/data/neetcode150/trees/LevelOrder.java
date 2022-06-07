package com.data.neetcode150.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(bfs(root));
    }

    private static List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i< size; i++){
                TreeNode current = queue.remove();
                currentLevel.add(current.val);

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }

            }
            result.add(currentLevel);
        }
        return result;
    }
}
