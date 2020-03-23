package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的后续遍历 extends Base {
    //解法一：根据前序遍历来
    //前序：根-》左》右
    //交换左右得：根-》右-》左
    //再反序插入
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if (root==null)
            return result;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current=stack.pop();
            result.add(0,current.val);
            if (current.left!=null)
                stack.push(current.left);
            if (current.right!=null)
                stack.push(current.right);
        }
        return result;
    }

    //解法二：两次push
    //第一种方法虽然得到了结果，但是其遍历过程，不是真正的后续遍历
    //后续遍历和前两种遍历不同的是
    //它走完右节点之后，就回不去根节点了
    //可以才去两次push来解决
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            if (root==null)
                continue;
            if (!stack.isEmpty()&&root==stack.peek()){
                stack.push(root.right);
                stack.push(root.right);
                stack.push(root.left);
                stack.push(root.left);
            }else {
                result.add(root.val);
            }
        }
        return result;
    }
}
