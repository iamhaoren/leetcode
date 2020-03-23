package leetcode;

import java.util.Stack;

public class 最小栈 extends Base {

    Stack<Integer> stack;
    Stack<Integer> helper;
//    public MinStack() {
//        stack=new Stack<>();
//        helper=new Stack<>();
//
//    }

    public void push(int x) {
        stack.push(x);
        if (helper.isEmpty()||x<=helper.peek())
            helper.push(x);

    }

    public void pop() {
        if (!stack.isEmpty()){
            int x=stack.pop();
            if (x==helper.peek())
                helper.pop();
        }

    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        return -1;
    }

    public int getMin() {
        if (!helper.isEmpty())
            return helper.peek();
        return -1;
    }
}
