package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newSeventeen {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(){
            this.val = val;
        }
    }

    public static ListNode mergeList(ListNode l1,ListNode l2){
        ListNode l3 = null;
        if (l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        if (l1.val < l2.val){
            l3 = l1;
            l3.next = mergeList(l1.next,l2);
        }else{
            l3 = l2;
            l3.next = mergeList(l1,l2.next);
        }
        return l3;
    }

}
