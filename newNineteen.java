package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newNineteen {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static void Mirror(TreeNode root){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }

        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
    }
}
