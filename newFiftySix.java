package chapter8;

/**
 * Created by sihanwang on 2017/5/29.
 */
public class newFiftySix {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead.next == null){
            return null;
        }
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        boolean isFirst = true;
        int count = 0;
        while(!fast.equals(slow) || isFirst){
            if (fast.equals(slow)){
                isFirst = false;
                count = 0;
            }
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }

        fast = pHead;
        for (;count>0;count--){
            fast = fast.next;
        }

        slow = pHead;
        while(!fast.equals(slow)){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
