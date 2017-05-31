package chapter8;

import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/31.
 */
public class newSixtyThree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k <= 0){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        TreeNode p = pRoot;
        while(p != null || !stack.empty()){
            while(p != null){
                stack.push(p);
                p = p.left;
            }
            p= stack.pop();
            count++;
            if (count == k){
                return p;
            }
            p = p.right;
        }
        return null;
    }
}
