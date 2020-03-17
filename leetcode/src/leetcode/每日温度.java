package leetcode;

import java.util.Stack;

public class 每日温度 extends Base {


    //解题思路：
    //乍一看这道题除了暴力毫无头绪，但是学会用单调栈的话将会比较简单
    public int[] dailyTemperatures(int[] T) {
        int[] result=new int[T.length];
        Stack<Integer> stack=new Stack<>();
        for (int i=T.length-1;i>=0;i++){
            while (!stack.isEmpty()&&T[i]>T[stack.peek()]){
                result[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
