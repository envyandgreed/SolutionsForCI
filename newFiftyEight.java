package chapter8;

/**
 * Created by sihanwang on 2017/5/30.
 */
public class newFiftyEight {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null){
            return null;
        }

        TreeLinkNode pNext = null;

        if (pNode.right != null){
            pNext = pNode.right;
            while(pNext.left != null){
                pNext = pNext.left;
            }
        }else if (pNode.next != null){
            pNext = pNode;
            while(pNext.next != null && !pNext.equals(pNext.next.left)){
                pNext = pNext.next;
            }
            pNext = pNext.next;
        }
        return pNext;
    }



}
