package chapter8;

/**
 * Created by sihanwang on 2017/5/30.
 */
public class newFiftyNine {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null){
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode left,TreeNode right){
            if (left == null){
                return right == null;
            }

            if (right == null){
                return false;
            }

            if (left.val != right.val){
                return false;
            }

            return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }
}
