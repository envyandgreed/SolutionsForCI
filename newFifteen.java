package highQuilityCode2;

/**
 * Created by sihanwang on 2017/5/9.
 */
public class newFifteen {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(){
            this.val = val;
        }
    }


    public static ListNode findNde(ListNode list,int k){
        if(list == null){
            return null;
        }
        if(k <= 0){
            return null;
        }
        ListNode head = list;
        ListNode behind;
        for (int i = 0;i < k - 1;i++){
            if(head.next != null){
                head = head.next;
            }else{
                return null;
            }
        }
        behind =list;
        while(head.next != null){
            head =head.next;
            behind = behind.next;
        }
        return behind;
    }
}
