package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newSixteen {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }


    public static ListNode reserveList(ListNode listNode){
        ListNode pNode = listNode;
        ListNode preNode = null;
        ListNode nextNode = null;
        ListNode tempNode = null;

        while (pNode != null){
            nextNode = pNode.next;
            if (nextNode == null){
                tempNode = pNode;
            }
            pNode.next = preNode;
            preNode = pNode;
            pNode = nextNode;
        }
        return  tempNode;
    }
}
