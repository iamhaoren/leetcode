package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 下一个更大元素I extends Base {
    //单调栈
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i:nums2){
            while(!stack.isEmpty()&&i>stack.peek()){
                int top=stack.pop();
                map.put(top,i);
            }
            stack.push(i);
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                result[i]=map.get(nums1[i]);
            }else{
                result[i]=-1;
            }
        }
        return result;
    }
}
