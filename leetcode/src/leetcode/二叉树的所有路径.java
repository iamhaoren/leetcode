package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的所有路径 extends Base {

    List<String> result=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs("",root);
        return result;
    }

    private void dfs(String s, TreeNode root) {
        if (root!=null){
            s+=String.valueOf(root.val);
            if (root.left==null&&root.right==null)
                result.add(s);
            else
                s+="->";
        }
        dfs(s,root.left);
        dfs(s,root.right);
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> list=new ArrayList<>();
        if (root==null)
            return list;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current=stack.pop();

        }
        return null;
    }
}
