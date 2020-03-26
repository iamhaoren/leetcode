package leetcode;

import java.util.Stack;

public class 比较含退格的字符串 {
    //使用栈来辅助操作
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for (char c:S.toCharArray()){
            if (c=='#'){
                if (!stack1.isEmpty())
                    stack1.pop();
            }else {
                stack1.push(c);
            }
        }
        for (char c:T.toCharArray()){
            if (c=='#'){
                if (!stack2.isEmpty())
                    stack2.pop();
            }else {
                stack2.push(c);
            }
        }
        return stack1.toString().equals(stack2.toString());
    }
}
