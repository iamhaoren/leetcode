package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的前序遍历 extends Base {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if (root==null)
            return result;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current=stack.pop();
            result.add(current.val);
            if (current.right!=null)
                stack.push(current.right);
            if (current.left!=null)
                stack.push(current.left);
        }
        return result;
    }
}
