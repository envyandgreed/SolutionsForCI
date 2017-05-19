package chapter3;

import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/18.
 */
public class newThirtySeven {
    public class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode findCommon(ListNode list1,ListNode list2){
        if (list1 == null || list2 == null){
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while(list1 != null){
            stack1.push(list1);
            list1 = list1.next;
        }

        while(list2 != null){
            stack2.push(list2);
            list2 = list2.next;
        }

        ListNode res = null;
        while(!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()){
            res = stack1.peek();
            stack1.pop();
            stack2.pop();
        }
        return  res;

    }
}
