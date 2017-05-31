package chapter8;

import java.util.ArrayList;
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

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null){
            return result;
        }
        Queue<TreeNode> layer = new LinkedList<>();
        ArrayList<Integer> layerList = new ArrayList<>();
        int index = 0;
        int count = 1;
        layer.add(pRoot);
        while(!layer.isEmpty()){
            TreeNode cur = layer.poll();
            layerList.add(cur.val);
            index++;
            if (cur.left != null){
                layer.add(cur.left);
            }
            if (cur.right != null){
                layer.add(cur.right);
            }

            if (index == count){
                count = layer.size();
                index = 0;
                result.add(layerList);
                layerList = new ArrayList<>();
            }
        }

        return result;
    }
}
