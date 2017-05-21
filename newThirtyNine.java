package chapter6;

/**
 * Created by sihanwang on 2017/5/19.
 */
public class newThirtyNine {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;
        }
    }
    public static int treeDeepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftRoot = treeDeepth(root.left);
        int rightRoot = treeDeepth(root.right);
        int total = Math.max(leftRoot,rightRoot);
        System.out.println(total + 1);
        return total + 1;
    }
}
