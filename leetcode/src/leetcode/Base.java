package leetcode;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,String> map=new HashMap<>();
        String s="a";
        map.put(s,"a-");
        s+="b";
        System.out.println(map.get(s));
    }
}
