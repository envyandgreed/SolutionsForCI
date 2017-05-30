package chapter8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sihanwang on 2017/5/31.
 */
public class newSixty {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
        public void printTree(TreeNode root){
            if (root == null){
            return;}

            Queue<TreeNode> list = new LinkedList<>();
            list.offer(root);
            int nextline = 0;
            int count = 1;
            while(!list.isEmpty()){
                TreeNode res = list.poll();
                count--;

                if (root.left != null){
                    list.offer(root.left);
                    nextline++;
                }

                if (root.right != null){
                    list.offer(root.right);
                    nextline++;
                }

                if (count == 0){
                    count = nextline;
                    nextline = 0;
                    System.out.println();
                }
            }



        }
        }
}
