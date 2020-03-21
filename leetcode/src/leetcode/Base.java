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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if (root==null)
            return result;
        Queue<TreeNode> queue=new LinkedList<>();
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode current=queue.poll();
                list.add(current.val);
                if (current.left!=null)
                    queue.add(current.left);
                if (current.right!=null)
                    queue.add(current.right);
            }
            result.add(list);
        }
        return result;
    }

}
