package 剑指offer;

import java.util.Stack;

public class 用两个栈实现队列 extends Base {
    //方法很简单
    //倒序进栈再倒序进栈就成了顺序的队列
    //思路：每次一pop，stack2有就直接pop
    //没有就将stack1的全部反序回来
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty()&&stack2.isEmpty())
            throw new RuntimeException("没元素了");
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
