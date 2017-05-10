package base1;

/**
 * Created by sihanwang on 2017/5/1.
 */
public class newSix {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }


    public TreeNode reConstructBinaryTree(int [] pre,int [] in){
        TreeNode root = innerFunction(pre,0,pre.length - 1,in,0,in.length - 1);
        return root;
    }

    public TreeNode innerFunction(int[] pre,int startPre,int endPre,int[] in, int statrtIn,int endIn){
            if (startPre > endPre || statrtIn > endIn){
                return null;
            }
            TreeNode node = new TreeNode(pre[startPre]);
        for (int i = statrtIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]){
                node.left = innerFunction(pre,startPre+1,startPre+i-statrtIn,in,statrtIn,i-1);
                node.right = innerFunction(pre,i-statrtIn+startPre+1,endPre,in,i+1,endIn);
            }
        }
        return node;
    }
}
