package base1;

import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/2.
 */
public class newSeven {
    class Solution{
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node){
            stack1.push(node);
        }
        public int pop(){
            if (stack1.empty() && stack2.empty()){
                throw new RuntimeException("Queue is empty");
            }
            if (stack2.empty()){
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack1.pop();
        }

    }
}
