package chapter3;

import java.util.Stack;

/**
 * Created by sihanwang on 2017/5/11.
 */
public class newTwentyTwo {
    public static boolean isOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }

        Stack<Integer> s = new Stack<Integer>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while (!s.empty() && s.peek() == popA[index]) {
                s.pop();
                index++;
            }
        }
        return s.empty();
    }
}
