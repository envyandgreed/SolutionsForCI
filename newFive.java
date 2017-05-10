package base1;

import java.util.ArrayList;

/**
 * Created by sihanwang on 2017/4/28.
 */
public class newFive {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int A){
            this.val = A;
            this.next = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }



    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(res,listNode);
        return res;
    }

    public static void helper(ArrayList<Integer> res,ListNode head){
        if (head != null){
            if (head.next != null){
                helper(res,head.next);
            }
            res.add(head.getVal());
        }
    }




    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);

        ArrayList result = printListFromTailToHead(one);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
