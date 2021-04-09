package leetcode;

import java.util.*;

public class Base {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        System.out.println((7^8)^7);
    }
    public String ReverseSentence(String str) {
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>0;i--)
            sb.append(arr[i]+" ");
        sb.append(arr[0]);
        return sb.toString();
    }
}
