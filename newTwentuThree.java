package chapter3;

import base1.newSix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sihanwang on 2017/5/11.
 */
public class newTwentuThree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }



    public static ArrayList<Integer> printTree(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.val+" ");

            if (node.left != null){
                queue.offer(node.left);
            }

            if (node.right != null){
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        return list;

    }
}
