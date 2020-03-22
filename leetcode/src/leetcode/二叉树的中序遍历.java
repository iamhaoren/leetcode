package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的中序遍历 extends Base {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty()||root!=null){
           while(root!=null){
               stack.push(root);
               root=root.left;
           }
           root=stack.pop();
           result.add(root.val);
           root=root.right;
        }
        return result;
    }
}
