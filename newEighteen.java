package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newEighteen {
    public class TreeNode{
        int val;
        TreeNode lchild;
        TreeNode rchild;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean HasSub(TreeNode t1,TreeNode t2){
        boolean result = false;
        if (t1 != null && t2 != null){
            if (t1.val == t2.val){
                result = containtree(t1,t2);
            }
            if (!result){
                result = containtree(t1.lchild,t2);
            }
            if (!result){
                result = containtree(t1.rchild,t2);
            }
        }
        return result;

    }
    public static boolean containtree(TreeNode t1,TreeNode t2){
        if (t1 == null && t2 != null){
            return false;
        }
        if (t2 == null){
            return true;
        }

        if (t1.val != t2.val){
            return false;
        }
        return containtree(t1.lchild,t2.lchild) && containtree(t1.lchild,t2.rchild);
    }
}
