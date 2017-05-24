package chapter6;

/**
 * Created by sihanwang on 2017/5/23.
 */
public class newFourtyFive {
    private  static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static int lastNum(int n,int m){
        if (n < 1 || m < 1){
            return -1;
        }

        if (n  == 1){
            return 0;
        }

        Node head = new Node(0);
        Node node = head;
        for (int i = 1; i < n; i++) {
            node.next = new Node(i);
            node = node.next;
        }
        node.next = head;
        int N = n;
        while(N > 1){
            for (int i = 1;i< m-1;i++){
                head = head.next;
            }
            System.out.print(head.next.val+" ");
            head.next = head.next.next;
            head = head.next;
            N--;
        }
        System.out.println();
        System.out.println(head.val);
        return head.val;

    }

    public static void main(String[] args) {
        lastNum(5,3);
    }
}
