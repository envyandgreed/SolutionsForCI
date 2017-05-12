package chapter3;

import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/10.
 */
public class newTwentyOne {
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    //Integer temp = null;
    public void push(int node){
        data.push(node);
        if (min.isEmpty() || node <= min.peek()){
            min.push(node);
        }else{
            min.push(min.peek());
        }
    }

    public int min(){
        return min.peek();
    }

    public void pop(){
        data.pop();
        min.pop();
    }

    public int top(){
        return data.peek();
    }
}
