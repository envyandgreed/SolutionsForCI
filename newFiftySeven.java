package chapter8;

/**
 * Created by sihanwang on 2017/5/30.
 */
public class newFiftySeven {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }


    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = pHead;
        pHead = dummy;


        while(pHead.next != null || pHead.next.next != null){
            if (pHead.next.val == pHead.next.next.val){
                int val = pHead.next.val;
                while(pHead.next != null && pHead.next.val == val){
                    pHead.next = pHead.next.next;
                }
            }else {
                //这个位置只是相当于更改了pHead的属性，而且是自身的，相当于person = person.age改变了，相当于更改自身的属性所以dummy不随着pHead变化。
                pHead = pHead.next;
            }
        }

        return dummy.next;
    }

}
