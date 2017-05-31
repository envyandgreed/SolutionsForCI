package chapter8;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/31.
 */
public class newSixtyOne {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        if (pRoot == null){
            return list;
        }

        s1.push(pRoot);
        while(!s1.empty() || !s2.empty()){
            //奇数
            if (layer % 2 != 0){
                ArrayList<Integer> temp = new ArrayList<>();
                while(!s1.empty()){
                   TreeNode cur = s1.pop();
                   if (cur != null){
                       temp.add(cur.val);
                       System.out.println(cur.val + " ");
                       s2.push(cur.left);
                       s2.push(cur.right);
                   }
                }
                if (!temp.isEmpty()){
                   list.add(temp);
                   layer++;
                   System.out.println();
                }
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                while(!s2.empty()){
                    TreeNode cur = s2.pop();
                    if (cur != null){
                        temp.add(cur.val);
                        System.out.println(cur.val + " ");
                        s1.push(cur.right);
                        s1.push(cur.left);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            }
        }
        return list;
    }
}
