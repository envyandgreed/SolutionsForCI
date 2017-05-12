package chapter3;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/5/11.
 */
public class newtwentyFive {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

    //}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(6);
        ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        System.out.println(list2);
    }
}
